package br.com.ricas.personalthings.domain.entity

import java.util.UUID

object FundFakeData {
    fun xplog11() = Fund(
        id = UUID.randomUUID().toString(),
        name = "XPLOG11"
    )

    fun fundExceededName() = Fund(
        id = UUID.randomUUID().toString(),
        name = "thisnamehasmorethan10char"
    )
}