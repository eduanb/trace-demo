package com.example.tracedemo

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Hooks

@SpringBootApplication
class TraceDemoApplication

fun main(args: Array<String>) {
    Hooks.enableAutomaticContextPropagation()
    runApplication<TraceDemoApplication>(*args)
}

@RestController
class HelloController {
    val logger = LoggerFactory.getLogger(HelloController::class.java)
    @GetMapping("/hello")
    suspend fun hello(): String {
        logger.info("hello")
        return "Hello"
    }
}