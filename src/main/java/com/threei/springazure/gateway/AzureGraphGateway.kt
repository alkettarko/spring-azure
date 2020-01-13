package com.threei.springazure.gateway

import com.microsoft.aad.adal4j.AuthenticationContext
import com.microsoft.aad.adal4j.AuthenticationResult
import com.microsoft.aad.adal4j.ClientCredential
import com.threei.springazure.dto.GroupDto
import com.threei.springazure.dto.GroupHelpDto
import com.threei.springazure.dto.UserDto
import com.threei.springazure.dto.UserHelpDto
import com.threei.springazure.utils.Constants
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.context.properties.bind.Bindable.listOf
import org.springframework.http.*
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

import javax.naming.ServiceUnavailableException
import java.util.Collections
import java.util.Objects
import java.util.concurrent.ExecutionException
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import java.util.concurrent.Future
import javax.persistence.metamodel.Bindable

@Component
class AzureGraphGateway {
    @Autowired
    internal var restTemplate: RestTemplate? = null
    @Autowired
    internal var constants: Constants? = null


    val usersFromGraph: List<UserDto>?
        @Throws(Throwable::class)
        get() {

            val headers = HttpHeaders()
            headers.accept = listOf<MediaType>(MediaType.APPLICATION_JSON)
            val aresult = getAccessTokenFromClientCredentialsForMicrosoftGraph(constants!!.clientId, constants!!.clientSecret, constants!!.tenantId)
            headers.set("Authorization", "Bearer " + aresult.accessToken)
            val entity = HttpEntity<String>(headers)
            val response = restTemplate!!.exchange<UserHelpDto>(constants!!.getAllUsersUri, HttpMethod.GET, entity,
                    UserHelpDto::class.java)
            return Objects.requireNonNull<UserHelpDto>(response.getBody()).value
        }



    val groupsFromGraph: List<GroupDto>?
        @Throws(Throwable::class)
        get() {

            val headers = HttpHeaders()
            headers.accept = listOf<MediaType>(MediaType.APPLICATION_JSON)
            val aresult = getAccessTokenFromClientCredentialsForMicrosoftGraph(constants!!.clientId, constants!!.clientSecret, constants!!.tenantId)
            headers.set("Authorization", "Bearer " + aresult.accessToken)
            val entity = HttpEntity<String>(headers)
            val response = restTemplate!!.exchange<GroupHelpDto>(constants!!.getAllGroupsUri, HttpMethod.GET, entity,
                    GroupHelpDto::class.java)
            return Objects.requireNonNull<GroupHelpDto>(response.getBody()).value
        }

    companion object {


        @Throws(Throwable::class)
        fun getAccessTokenFromClientCredentialsForMicrosoftGraph(clientId: String, clientSecret: String, tenantId: String): AuthenticationResult {
            var context: AuthenticationContext? = null
            var result: AuthenticationResult? = null
            var service: ExecutorService? = null
            try {
                service = Executors.newFixedThreadPool(1)
                context = AuthenticationContext("https://login.windows.net/$tenantId/", true, service!!)
                val future = context.acquireToken("https://graph.microsoft.com",
                        ClientCredential(clientId, clientSecret), null)
                result = future.get()
            } catch (e: ExecutionException) {
                throw e.cause!!
            } finally {
                service!!.shutdown()
            }
            if (result == null) {
                throw ServiceUnavailableException("authentication result was null")
            }
            return result
        }
    }
}
