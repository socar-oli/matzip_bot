package com.example.matzipbot.restaurant.model

import org.junit.jupiter.api.Assertions.*

internal class RestaurantTest {
    companion object {
        val FIRST_RESTAURANT = Restaurant(
            "firstRestaurant",
            Category.KOREAN,
            0.0f,
            0.0f,
            0,
            "서울시 성동구 D타워",
            "testLink"
        )

        val SECOND_RESTAURANT = Restaurant(
            "secondRestaurant",
            Category.WESTERN,
            1.0f,
            2.0f,
            1,
            "서울시 성동구 D타워",
            "testLink"
        )

        val THIRD_RESTAURANT = Restaurant(
            "thirdRestaurant",
            Category.KOREAN,
            3.0f,
            4.0f,
            1,
            "서울시 성동구 D타워",
            "testLink"
        )
    }
}