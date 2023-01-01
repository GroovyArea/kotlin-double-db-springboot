package com.example.kotbegin.user.domain

import javax.persistence.*

@Entity
@Table(name = "users")
class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null
    val userName: String = ""
    val email: String = ""
}