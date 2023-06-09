package net.konohana.sakuya.enjurw.inquiry.controller

import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.post
import io.ktor.server.routing.route
import net.konohana.sakuya.enjurw.inquiry.models.fromsta.EnjuRW01FromStaInfo
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction

fun Route.enjuRWFromStaInfoController() {
    route("enju") {
        route("crud") {
            route("enjurw01fromstainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW01FromStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW01FromStaInfo"))
                }
            }
        }
    }
}
