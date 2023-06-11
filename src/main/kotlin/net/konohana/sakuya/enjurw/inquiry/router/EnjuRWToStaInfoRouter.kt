package net.konohana.sakuya.enjurw.inquiry.router

import io.ktor.server.routing.Route
import net.konohana.sakuya.enjurw.inquiry.controller.enjuRWToStaInfoController

fun Route.enjuRWToStaInfoRouter() {
    enjuRWToStaInfoController()
}
