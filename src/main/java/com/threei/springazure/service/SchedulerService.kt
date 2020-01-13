package com.threei.springazure.service

import com.threei.springazure.gateway.AzureGraphGateway
import com.threei.springazure.model.Group
import com.threei.springazure.model.User
import com.threei.springazure.repository.GroupRepository
import com.threei.springazure.repository.UserRepository
import com.threei.springazure.utils.Converter
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service
import java.util.*


@Service
@EnableScheduling
class SchedulerService {

    @Autowired
    lateinit var userRepository: UserRepository
    @Autowired
    lateinit var groupRepository: GroupRepository
    @Autowired
    lateinit var azureGraphGateway: AzureGraphGateway
    @Autowired
    lateinit var converter: Converter



    @Scheduled(fixedDelay = 1000) //every one second
    @Throws(Throwable::class)
    fun saveUsers() {
        val dbUsers = userRepository.findAll()
        val azureUsers = azureGraphGateway.usersFromGraph
        for (index in azureUsers!!) {
            if (!isUserRegisteredInDb(dbUsers, index.id!!)) {
                userRepository.save(converter.convertToUser(index))
            }
        }
    }

    @Scheduled(fixedDelay = 1000)
    @Throws(Throwable::class)
    fun saveGroups() {

        val dbGroups = groupRepository!!.findAll()
        val azureGroups = azureGraphGateway!!.groupsFromGraph

        if (azureGroups != null) {
            for (index in azureGroups) {
                if (!isGroupRegisteredInDb(dbGroups, index.id)) {
                    groupRepository!!.save(converter!!.convertToGroup(index))
                }
            }
        }
    }

    fun isUserRegisteredInDb(users: List<User>, userId: UUID): Boolean {
        for (index in users) {
            if (index.id == userId) {
                return true
            }
        }
        return false
    }

    fun isGroupRegisteredInDb(groups: List<Group>, groupId: UUID?): Boolean {
        for (index in groups) {
            if (index.id == groupId) {
                return true
            }
        }
        return false
    }

}
