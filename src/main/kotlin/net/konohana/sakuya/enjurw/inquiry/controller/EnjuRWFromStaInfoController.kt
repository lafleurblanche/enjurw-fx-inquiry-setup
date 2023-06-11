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
import net.konohana.sakuya.enjurw.inquiry.models.fromsta.EnjuRW05FromStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.fromsta.EnjuRW06FromStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.fromsta.EnjuRW07FromStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.fromsta.EnjuRW08FromStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.fromsta.EnjuRW09FromStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.fromsta.EnjuRW10FromStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.fromsta.EnjuRW11FromStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.fromsta.EnjuRW12FromStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.fromsta.EnjuRW13FromStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.fromsta.EnjuRW14FromStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.fromsta.EnjuRW15FromStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.fromsta.EnjuRW16FromStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.fromsta.EnjuRW17FromStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.fromsta.EnjuRW18FromStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.fromsta.EnjuRW19FromStaInfo
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
            route("enjurw05fromstainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW05FromStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW05FromStaInfo"))
                }
            }
            route("enjurw06fromstainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW06FromStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW06FromStaInfo"))
                }
            }
            route("enjurw07fromstainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW07FromStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW07FromStaInfo"))
                }
            }
            route("enjurw08fromstainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW08FromStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW08FromStaInfo"))
                }
            }
            route("enjurw09fromstainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW09FromStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW09FromStaInfo"))
                }
            }
            route("enjurw10fromstainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW10FromStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW10FromStaInfo"))
                }
            }
            route("enjurw11fromstainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW11FromStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW11FromStaInfo"))
                }
            }
            route("enjurw12fromstainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW12FromStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW12FromStaInfo"))
                }
            }
            route("enjurw13fromstainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW13FromStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW13FromStaInfo"))
                }
            }
            route("enjurw14fromstainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW14FromStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW14FromStaInfo"))
                }
            }
            route("enjurw15fromstainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW15FromStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW15FromStaInfo"))
                }
            }
            route("enjurw16fromstainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW16FromStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW16FromStaInfo"))
                }
            }
            route("enjurw17fromstainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW17FromStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW17FromStaInfo"))
                }
            }
            route("enjurw18fromstainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW18FromStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW18FromStaInfo"))
                }
            }
            route("enjurw19fromstainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW19FromStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW19FromStaInfo"))
                }
            }
        }
    }
}
