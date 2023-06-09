package net.konohana.sakuya.enjurw.inquiry.controller

import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.post
import io.ktor.server.routing.route
import net.konohana.sakuya.enjurw.inquiry.models.fromsta.EnjuRW01FromStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.fromsta.EnjuRW02FromStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.fromsta.EnjuRW03FromStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.fromsta.EnjuRW04FromStaInfo
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
            route("enjurw02fromstainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW02FromStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW02FromStaInfo"))
                }
            }
            route("enjurw03fromstainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW03FromStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW03FromStaInfo"))
                }
            }
            route("enjurw04fromstainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW04FromStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW04FromStaInfo"))
                }
            }
        }
    }
}
