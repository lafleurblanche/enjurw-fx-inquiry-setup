package net.konohana.sakuya.enjurw.inquiry.plugins

import com.fasterxml.jackson.databind.SerializationFeature
import io.ktor.serialization.jackson.jackson
import io.ktor.serialization.kotlinx.json.json
import io.ktor.server.application.Application
import io.ktor.server.application.install
import io.ktor.server.plugins.contentnegotiation.ContentNegotiation
import io.ktor.server.routing.routing
import net.konohana.sakuya.enjurw.inquiry.router.enjuRWFromSTaInfoRouter
import net.konohana.sakuya.enjurw.inquiry.router.enjuRWToStaInfoRouter

fun Application.configureSerialization() {
    install(ContentNegotiation) {
        json()
        jackson {
            enable(SerializationFeature.INDENT_OUTPUT)
        }
    }
    routing {
        enjuRWFromSTaInfoRouter()
        enjuRWToStaInfoRouter()
    }
}
