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
import net.konohana.sakuya.enjurw.inquiry.models.tosta.EnjuRW05ToStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.tosta.EnjuRW06ToStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.tosta.EnjuRW07ToStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.tosta.EnjuRW08ToStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.tosta.EnjuRW09ToStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.tosta.EnjuRW10ToStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.tosta.EnjuRW11ToStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.tosta.EnjuRW12ToStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.tosta.EnjuRW13ToStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.tosta.EnjuRW14ToStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.tosta.EnjuRW15ToStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.tosta.EnjuRW16ToStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.tosta.EnjuRW17ToStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.tosta.EnjuRW18ToStaInfo
import net.konohana.sakuya.enjurw.inquiry.models.tosta.EnjuRW19ToStaInfo
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
            route("enjurw05tostainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW05ToStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW05ToStaInfo"))
                }
            }
            route("enjurw06tostainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW06ToStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW06ToStaInfo"))
                }
            }
            route("enjurw07tostainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW07ToStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW07ToStaInfo"))
                }
            }
            route("enjurw08tostainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW08ToStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW08ToStaInfo"))
                }
            }
            route("enjurw09tostainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW09ToStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW09ToStaInfo"))
                }
            }
            route("enjurw10tostainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW10ToStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW10ToStaInfo"))
                }
            }
            route("enjurw11tostainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW11ToStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW11ToStaInfo"))
                }
            }
            route("enjurw12tostainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW12ToStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW12ToStaInfo"))
                }
            }
            route("enjurw13tostainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW13ToStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW13ToStaInfo"))
                }
            }
            route("enjurw14tostainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW14ToStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW14ToStaInfo"))
                }
            }
            route("enjurw15tostainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW15ToStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW15ToStaInfo"))
                }
            }
            route("enjurw16tostainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW16ToStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW16ToStaInfo"))
                }
            }
            route("enjurw17tostainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW17ToStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW17ToStaInfo"))
                }
            }
            route("enjurw18tostainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW18ToStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW18ToStaInfo"))
                }
            }
            route("enjurw19tostainfo") {
                post {
                    transaction {
                        SchemaUtils.create(EnjuRW19ToStaInfo)
                    }
                    call.respond(mapOf("Created:" to "EnjuRW19ToStaInfo"))
                }
            }
        }
    }
}
