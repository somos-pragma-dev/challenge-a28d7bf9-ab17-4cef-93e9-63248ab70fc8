package com.fintech.loan

import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry

object CircuitBreakerConfig {
    fun init() {
        val registry = CircuitBreakerRegistry.ofDefaults()
        val config = CircuitBreakerConfig.custom()
           .failureRateThreshold(50)
           .waitDurationInOpenState(60000)
           .permittedNumberOfCallsInHalfOpenState(3)
           .automaticTransitionFromOpenToHalfOpenEnabled(true)
           .build()
        registry.circuitBreaker("riskEvaluationCircuitBreaker", config)
    }
}