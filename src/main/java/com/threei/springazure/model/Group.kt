package com.threei.springazure.model

import jdk.internal.dynalink.DefaultBootstrapper
import lombok.Data
import org.hibernate.annotations.GenericGenerator

import javax.persistence.*
import java.util.Date
import java.util.UUID

@Data
@Entity
@Table(name = "GROUP_TABLE")
class Group {

    @Id
    var id: UUID? = null;
    @Column
    var createdDateTime: Date? = null;
    @Column
    var classification: String? = null;
    @Column
    var description: String? = null;
    @Column
    var displayName: String? = null;
    @Column
    var isAssignableToRole: String? = null;
    @Column
    var mail: String? = null;
    @Column
    var isMailEnabled: Boolean? = null;
    @Column
    var mailNickname: String? = null;
    @Column
    var onPremisesDomainName: String? = null;
    @Column
    var onPremisesLastSyncDateTime: Date? = null;
    @Column
    var onPremisesNetBiosName: String? = null;
    @Column
    var onPremisesSamAccountName: String? = null;
    @Column
    var onPremisesSecurityIdentifier: String? = null;
    @Column
    var onPremisesSyncEnabled: String? = null;
    @Column
    var preferredDataLocation: String? = null;
    @Column
    var renewedDateTime: Date? = null;
    @Column
    var isSecurityEnabled: Boolean? = null;
    @Column
    var securityIdentifier: String? = null;
    @Column
    var visibility: String? = null;
}
