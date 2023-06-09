package net.konohana.sakuya.enjurw.inquiry

import io.ktor.server.application.*
import net.konohana.sakuya.enjurw.inquiry.db.initMioriDB
import net.konohana.sakuya.enjurw.inquiry.plugins.*

fun main(args: Array<String>): Unit =
    io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    val url = environment.config.property("ktor.mioridb.uri").getString()
    val username = environment.config.property("ktor.mioridb.username").getString()
    val password = environment.config.property("ktor.mioridb.password").getString()
    initMioriDB(url, username, password)
    configureSerialization()
    configureRouting()
}
