package com.threei.springazure.model

import lombok.Data
import org.hibernate.annotations.GenericGenerator
import org.springframework.stereotype.Component

import javax.persistence.*
import java.util.UUID

@Data
@Entity
@Table(name = "USER_TABLE")
class User {
    @Id
    @Column
    var id: UUID? = null
    @Column
    var displayName: String? = null
    @Column
    var givenName: String? = null
    @Column
    var jobTitle: String? = null
    @Column
    var mail: String? = null
     @Column
    var mobilePhone: String? = null
    @Column
    var officeLocation: String? = null
     @Column
    var preferredLanguage: String? = null
     @Column
    var surname: String? = null
     @Column
    var userPrincipalName: String? = null
}


