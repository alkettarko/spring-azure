package com.threei.springazure.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import lombok.Data
import org.springframework.stereotype.Component

import javax.persistence.Column
import java.util.Date
import java.util.UUID

@Data
@Component
@JsonIgnoreProperties(ignoreUnknown = true)
class GroupDto {

    var id: UUID? = null
    var deletedDateTime: Date? = null
    var createdDateTime: Date? = null
    var classification: String? = null
    var description: String? = null
    var displayName: String? = null
    var isAssignableToRole: String? = null
    var mail: String? = null
    var isMailEnabled: Boolean = false
    var mailNickname: String? = null
    var onPremisesDomainName: String? = null
    var onPremisesLastSyncDateTime: Date? = null
    var onPremisesNetBiosName: String? = null
    var onPremisesSamAccountName: String? = null
    var onPremisesSecurityIdentifier: String? = null
    var onPremisesSyncEnabled: String? = null
    var preferredDataLocation: String? = null
    var renewedDateTime: Date? = null
    var isSecurityEnabled: Boolean = false
    var securityIdentifier: String? = null
    var visibility: String? = null

}
