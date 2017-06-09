package com.notahelloworld.kotlin.extensions

class CurrencyModel(
    val value: String = "2,00"
) {

  fun getDoubleValue(): Double = value.replaceCommaToDot().toDouble()
}
