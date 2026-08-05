package com.fintech.loan

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.github.resilience4j.circuitbreaker.CircuitBreaker
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry

object RiskEvaluationClient {
    private val client = HttpClient(CIO)
    private val circuitBreakerRegistry = CircuitBreakerRegistry.ofDefaults()
    private val circuitBreaker = circuitBreakerRegistry.circuitBreaker("riskEvaluationCircuitBreaker")

    suspend fun evaluateRisk(loanRequest: String): String {
        return circuitBreaker.decorateSuspendFunction {
            runBlocking {
                client.get<HttpResponse>("http://risk-evaluation-service/evaluate") {
                    header("Loan-Request", loanRequest)
                }.bodyAsText()
            }
        }
    }
}