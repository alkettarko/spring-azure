package com.threei.springazure.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import lombok.Data

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
class GroupHelpDto {
    var value: List<GroupDto>? = null
        set(value) {
            field = this.value
        }
}
