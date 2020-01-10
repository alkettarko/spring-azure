package com.threei.springazure.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import lombok.Data
import java.util.UUID

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class UserDto {
    var id: UUID? = null
        set(id) {
            field = this.id
        }
    var displayName: String? = null
        set(displayName) {
            field = this.displayName
        }
    var givenName: String? = null
        set(givenName) {
            field = this.givenName
        }
    var jobTitle: String? = null
        set(jobTitle) {
            field = this.jobTitle
        }
    var mail: String? = null
        set(mail) {
            field = this.mail
        }
    var mobilePhone: String? = null
        set(mobilePhone) {
            field = this.mobilePhone
        }
    var officeLocation: String? = null
        set(officeLocation) {
            field = this.officeLocation
        }
    var preferredLanguage: String? = null
        set(preferredLanguage) {
            field = this.preferredLanguage
        }
    var surname: String? = null
        set(surname) {
            field = this.surname
        }
    var userPrincipalName: String? = null
        set(userPrincipalName) {
            field = this.userPrincipalName
        }

}
