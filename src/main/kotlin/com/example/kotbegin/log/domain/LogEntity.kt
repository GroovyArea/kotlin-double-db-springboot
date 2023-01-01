package com.example.kotbegin.log.domain

import org.springframework.data.mongodb.core.mapping.Document
import javax.persistence.Id

@Document(collection = "log")
class LogEntity {

    @Id
    var id: String? = null
    var content: String? = null
}