package com.github.nobusugi246.mmchatbot.dataset

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Pomodoro (@Id @GeneratedValue val id: Long,
                     val title: String,
                     val username: String,
                     val startDateTime: LocalDateTime = LocalDateTime.now())
