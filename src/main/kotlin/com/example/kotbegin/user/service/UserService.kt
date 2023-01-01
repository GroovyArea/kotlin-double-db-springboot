package com.example.kotbegin.user.service

import com.example.kotbegin.user.domain.UserEntity
import com.example.kotbegin.user.repository.UserEntityRepository
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userEntityRepository: UserEntityRepository
) {
    fun getUsers(): List<UserEntity> = userEntityRepository.findAll()
}