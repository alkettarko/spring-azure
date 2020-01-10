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
        set(id) {
            field = this.id
        }
    var deletedDateTime: Date? = null
        set(deletedDateTime) {
            field = this.deletedDateTime
        }
    var createdDateTime: Date? = null
        set(createdDateTime) {
            field = this.createdDateTime
        }
    var classification: String? = null
        set(classification) {
            field = this.classification
        }
    var description: String? = null
        set(description) {
            field = this.description
        }
    var displayName: String? = null
        set(displayName) {
            field = this.displayName
        }
    var isAssignableToRole: String? = null
        set(isAssignableToRole) {
            field = this.isAssignableToRole
        }
    var mail: String? = null
        set(mail) {
            field = this.mail
        }
    var isMailEnabled: Boolean = false
        set(mailEnabled) {
            field = isMailEnabled
        }
    var mailNickname: String? = null
        set(mailNickname) {
            field = this.mailNickname
        }
    var onPremisesDomainName: String? = null
        set(onPremisesDomainName) {
            field = this.onPremisesDomainName
        }
    var onPremisesLastSyncDateTime: Date? = null
        set(onPremisesLastSyncDateTime) {
            field = this.onPremisesLastSyncDateTime
        }
    var onPremisesNetBiosName: String? = null
        set(onPremisesNetBiosName) {
            field = this.onPremisesNetBiosName
        }
    var onPremisesSamAccountName: String? = null
        set(onPremisesSamAccountName) {
            field = this.onPremisesSamAccountName
        }
    var onPremisesSecurityIdentifier: String? = null
        set(onPremisesSecurityIdentifier) {
            field = this.onPremisesSecurityIdentifier
        }
    var onPremisesSyncEnabled: String? = null
        set(onPremisesSyncEnabled) {
            field = this.onPremisesSyncEnabled
        }
    var preferredDataLocation: String? = null
        set(preferredDataLocation) {
            field = this.preferredDataLocation
        }
    var renewedDateTime: Date? = null
        set(renewedDateTime) {
            field = this.renewedDateTime
        }
    var isSecurityEnabled: Boolean = false
        set(securityEnabled) {
            field = isSecurityEnabled
        }
    var securityIdentifier: String? = null
        set(securityIdentifier) {
            field = this.securityIdentifier
        }
    var visibility: String? = null
        set(visibility) {
            field = this.visibility
        }

}
