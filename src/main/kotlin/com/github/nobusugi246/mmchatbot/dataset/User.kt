package com.github.nobusugi246.mmchatbot.dataset

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class User (@Id val name: String,
                 val lastLoginDate: LocalDateTime)
