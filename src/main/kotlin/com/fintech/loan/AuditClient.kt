package com.fintech.loan

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

object AuditClient {
    private val client = HttpClient(CIO)

    suspend fun auditLoan(loanId: String) {
        runBlocking {
            client.post<HttpResponse>("http://audit-service/audit") {
                header("Loan-Id", loanId)
            }
        }
    }
}