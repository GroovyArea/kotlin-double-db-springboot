package com.example.kotbegin.user.repository

import com.example.kotbegin.user.domain.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserEntityRepository: JpaRepository<UserEntity, Int> {
}