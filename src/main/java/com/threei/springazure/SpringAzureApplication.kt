package com.threei.springazure

import org.springframework.boot.SpringApplication
import org.springframework.boot.SpringApplication.*
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class SpringAzureApplication {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            run(SpringAzureApplication::class.java, *args)
        }
    }
}
