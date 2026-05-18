package com.example.kts.rest.spring.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class WorkItem(@Id @GeneratedValue val id: Int = -1,val code: String,
                    val type: String,
                    val title: String,
                    val status: String,
                    val completed : Boolean,
                    val link: String) {
}