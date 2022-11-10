package com.example.matzipbot.restaurant.model

class Restaurant(
    val name: String,
    val category: Category,
    var total_rating: Float = 0.0f,
    var price_rating: Float = 0.0f,
    var numberOfEvaluationStaff: Int = 0,
    val location: String,
    val link: String
)

