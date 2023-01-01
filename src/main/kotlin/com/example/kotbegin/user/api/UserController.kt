package com.example.kotbegin.user.api

import com.example.kotbegin.user.domain.UserEntity
import com.example.kotbegin.user.service.UserService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
    private val userService: UserService
) {

    @GetMapping("/users")
    fun getAllUsers(): List<UserEntity> {
        return userService.getUsers()
    }
}