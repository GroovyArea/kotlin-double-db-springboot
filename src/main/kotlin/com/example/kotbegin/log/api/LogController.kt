package com.example.kotbegin.log.api

import com.example.kotbegin.log.domain.LogEntity
import com.example.kotbegin.log.service.LogService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class LogController(
    private val logService: LogService
) {

    @GetMapping("/logs")
    fun getAllLogs(): List<LogEntity> {
        return logService.getAllLogs()
    }

    @PostMapping("/logs")
    fun writeDailyLog(@RequestBody logEntity: LogEntity) {
        return logService.writeLog(logEntity)
    }
}