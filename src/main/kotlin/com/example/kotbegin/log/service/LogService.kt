package com.example.kotbegin.log.service

import com.example.kotbegin.log.domain.LogEntity
import com.example.kotbegin.log.repository.LogEntityRepository
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.stereotype.Service

@Service
class LogService(
    val logEntityRepository: LogEntityRepository,
    val mongoTemplate: MongoTemplate
) {

    fun getAllLogs() : List<LogEntity>{
        return logEntityRepository.findAll()
    }

    fun writeLog(logEntity: LogEntity) {
        mongoTemplate.save(logEntity)
    }
}