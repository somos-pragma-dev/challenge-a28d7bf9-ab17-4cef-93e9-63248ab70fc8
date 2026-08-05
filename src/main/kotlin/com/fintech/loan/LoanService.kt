package com.fintech.loan

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.gson.*
import io.ktor.routing.*
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import kotlinx.coroutines.runBlocking
import org.slf4j.LoggerFactory

private val logger = LoggerFactory.getLogger(LoanService::class.java)

fun main() {
    embeddedServer(Netty, port = 8080) {
        install(ContentNegotiation) {
            gson {}
        }
        routing {
            get("/loan") {
                call.respondText("Hello, Loan Service!")
            }
        }
    }.start(wait = true)
}