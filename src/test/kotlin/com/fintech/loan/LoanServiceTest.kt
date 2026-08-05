package com.fintech.loan

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.server.testing.*
import org.junit.Test
import kotlin.test.assertEquals

class LoanServiceTest {
    @Test
    fun testLoanService() {
        withTestApplication({::main}) {
            handleRequest(HttpMethod.Get, "/loan").apply {
                assertEquals(HttpStatusCode.OK, response.status())
                assertEquals("Hello, Loan Service!", response.content)
            }
        }
    }
}