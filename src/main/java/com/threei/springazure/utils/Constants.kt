package com.threei.springazure.utils

import lombok.Data
import org.springframework.stereotype.Component

@Data
@Component
class Constants {
    val getAllUsersUri = "https://graph.microsoft.com/v1.0/users"
    val getAllGroupsUri = "https://graph.microsoft.com/v1.0/groups"
    val clientId = "e63f141c-fea2-4ead-8387-84b72c04a5e8"
    val clientSecret = "nGBY-9kd6dbAX6B9GPUAf@[yQwhhodI."
    val tenantId = "b0577935-a8d8-48f1-8373-96ba0b923972"
}