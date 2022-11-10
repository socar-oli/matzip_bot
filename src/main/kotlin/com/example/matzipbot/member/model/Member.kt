package com.example.matzipbot.member.model

class Member(
    val id: String,
    val nickname: String
) {
    var foodList = mutableListOf<String>()
}