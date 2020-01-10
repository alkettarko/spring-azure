package com.threei.springazure.repository

import com.threei.springazure.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

import java.util.UUID

@Repository
interface UserRepository : JpaRepository<User, UUID>
