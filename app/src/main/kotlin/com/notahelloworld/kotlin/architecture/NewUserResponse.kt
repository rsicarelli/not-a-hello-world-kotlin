package com.notahelloworld.kotlin.architecture

data class NewUserResponse(
    var id: String,
    var name: String,
    var email: String,
    var phone: String,
    val status: String
)
