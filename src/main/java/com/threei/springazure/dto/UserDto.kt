package com.threei.springazure.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import lombok.Data
import java.util.UUID

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class UserDto {

    var id: UUID? = null
    var displayName: String? = null
    var givenName: String? = null
    var jobTitle: String? = null
    var mail: String? = null
    var mobilePhone: String? = null
    var officeLocation: String? = null
    var preferredLanguage: String? = null
    var surname: String? = null
    var userPrincipalName: String? = null

}
