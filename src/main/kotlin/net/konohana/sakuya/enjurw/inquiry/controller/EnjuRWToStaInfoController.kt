package net.konohana.sakuya.enjurw.inquiry.controller

import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.post
import io.ktor.server.routing.route
import net.konohana.sakuya.enjurw.inquiry.models.tosta.EnjuRW01ToStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.tosta.EnjuRW02ToStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.tosta.EnjuRW03ToStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.tosta.EnjuRW04ToStaInfo
import org.jetbrains.exposed.sql.SchemaUtils
import org.jetbrains.exposed.sql.transactions.transaction

fun Route.enjuRWToStaInfoController() {
    route("enju") {
        route("crud") {
            route("enjurw01tostainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW01ToStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW01ToStaInfo"))
                }
            }
            route("enjurw02tostainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW02ToStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW02ToStaInfo"))
                }
            }
            route("enjurw03tostainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW03ToStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW03ToStaInfo"))
                }
            }
            route("enjurw04tostainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW04ToStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW04ToStaInfo"))
                }
            }
        }
    }
}
