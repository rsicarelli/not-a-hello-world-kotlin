package com.notahelloworld.kotlin.extensions

fun String.replaceCommaToDot(): String {
  return this.replace("[,]".toRegex(), ".")
}
