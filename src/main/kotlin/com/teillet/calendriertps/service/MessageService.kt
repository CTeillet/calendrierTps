package com.teillet.calendriertps.service

import com.teillet.calendriertps.model.Message
import com.teillet.calendriertps.repository.MessageRepository
import org.springframework.stereotype.Service

@Service
class MessageService(val db: MessageRepository) {

    fun findMessages(): List<Message> = db.findMessages()

    fun post(message: Message){
        db.save(message)
    }
}