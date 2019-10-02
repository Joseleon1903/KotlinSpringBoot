package com.example.kts.rest.spring

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringRestApplication {

	private val log = LoggerFactory.getLogger(KotlinSpringRestApplication::class.java)

}

fun main(args: Array<String>) {
	runApplication<KotlinSpringRestApplication>(*args)
}