package net.konohana.sakuya.enjurw.inquiry.db

import org.jetbrains.exposed.sql.Database

fun initMioriDB(url: String, username: String, password: String) = Database.connect(
    url = url,
    driver = "org.postgresql.Driver",
    user = username,
    password = password
)
