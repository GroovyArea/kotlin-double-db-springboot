package com.example.kotbegin.log.repository

import com.example.kotbegin.log.domain.LogEntity
import org.springframework.data.jpa.repository.JpaRepository

interface LogEntityRepository:JpaRepository<LogEntity, String> {
}