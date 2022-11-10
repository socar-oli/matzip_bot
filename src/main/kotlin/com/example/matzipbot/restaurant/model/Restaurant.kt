package com.example.matzipbot.restaurant.model

import com.example.matzipbot.RestaurantRequest

class Restaurant(
    val name: String,
    val category: Category,
    var totalRating: Float = 0.0f,
    var priceRating: Float = 0.0f,
    var numberOfEvaluationStaff: Int = 0,
    val location: String,
    val link: String
) {
    constructor(request: RestaurantRequest) : this(
        name = request.name,
        category = Category.of(request.category),
        location = request.location,
        link = request.link
    )

    fun updateRating(rating: Int, priceRating: Int) {
        checkRating(rating, priceRating)
        numberOfEvaluationStaff++
        this.totalRating = (this.totalRating * numberOfEvaluationStaff + rating) / numberOfEvaluationStaff.toFloat()
        this.priceRating =
            (this.priceRating * numberOfEvaluationStaff + priceRating) / numberOfEvaluationStaff.toFloat()
    }

    private fun checkRating(rating: Int, priceRating: Int) {
        if (!isInRatingRange(rating) || !isInRatingRange(priceRating)) {
            throw IllegalArgumentException("Rating must be 0~5")
        }
    }

    private fun isInRatingRange(rating: Int): Boolean {
        return rating in 0..5
    }

    fun getCategory(): String = category.category

}




