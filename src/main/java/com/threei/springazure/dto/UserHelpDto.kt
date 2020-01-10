package com.threei.springazure.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import lombok.Data

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class UserHelpDto {

    var value: List<UserDto>? = null
        set(value) {
            field = this.value
        }
}
