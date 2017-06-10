package com.notahelloworld.kotlin.model

data class NewUserResponse(
    var id: String,
    var name: String,
    var email: String,
    var phone: String,
    val status: String
)
