package com.threei.springazure.utils

import com.threei.springazure.dto.GroupDto
import com.threei.springazure.dto.UserDto
import com.threei.springazure.model.Group
import com.threei.springazure.model.User
import org.springframework.stereotype.Component

@Component
class Converter {
    fun convertToUser(userDto: UserDto): User {
        val user = User()
        user.displayName = userDto.displayName
        user.givenName = userDto.givenName
        user.id = userDto.id
        user.jobTitle = userDto.jobTitle
        user.mail = userDto.mail
        user.mobilePhone = userDto.mobilePhone
        user.officeLocation = userDto.officeLocation
        user.preferredLanguage = userDto.preferredLanguage
        user.surname = userDto.surname
        user.userPrincipalName = userDto.userPrincipalName
        return user
    }

//    fun convertToGroup(groupDto: GroupDto): Group {
//        val group = Group()
//        group.id = groupDto.id
//        group.classification = groupDto.classification
//        group.createdDateTime = groupDto.createdDateTime
//        group.deletedDateTime = groupDto.deletedDateTime
//        group.description = groupDto.description
//        group.displayName = groupDto.displayName
//        groupDto.isAssignableToRole?.let { group.setIsAssignableToRole(it) }
//        group.mail = groupDto.mail
//        group.isMailEnabled = groupDto.isMailEnabled
//        group.mailNickname = groupDto.mailNickname
//        group.onPremisesDomainName = groupDto.onPremisesDomainName
//        group.onPremisesLastSyncDateTime = groupDto.onPremisesLastSyncDateTime
//        group.onPremisesNetBiosName = groupDto.onPremisesNetBiosName
//        group.onPremisesSamAccountName = groupDto.onPremisesSamAccountName
//        group.onPremisesSecurityIdentifier = groupDto.onPremisesSecurityIdentifier
//        group.onPremisesSyncEnabled = groupDto.onPremisesSyncEnabled
//        group.preferredDataLocation = groupDto.preferredDataLocation
//        group.renewedDateTime = groupDto.renewedDateTime
//        group.isSecurityEnabled = groupDto.isSecurityEnabled
//        group.securityIdentifier = groupDto.securityIdentifier
//        group.visibility = groupDto.visibility
//        return group
//    }
}