package net.konohana.sakuya.enjurw.inquiry.models.tosta

import org.jetbrains.exposed.sql.Table

/**
 * ## EnjuRW18ToStaInfoモデル
 * * 卯塚線降車駅情報
 * @author lafleurblanche
 */
object EnjuRW18ToStaInfo : Table("enju_rw18_to_sta_info") {
    /** ID(自動採番) */
    val id = integer("id").autoIncrement()
    /** 降車駅コード */
    val toStaCode = varchar("to_sta_code", length = 20)
    /** 降車駅名 */
    val toStaName = varchar("to_sta_name", length = 20)
}
