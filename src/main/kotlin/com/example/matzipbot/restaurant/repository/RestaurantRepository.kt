package com.example.matzipbot.restaurant.repository

import com.example.matzipbot.restaurant.model.Restaurant
import org.springframework.stereotype.Repository

@Repository
class RestaurantRepository {

    val restaurants: MutableSet<Restaurant> = mutableSetOf()

    @Synchronized
    fun save(restaurant: Restaurant) = restaurants.add(restaurant)

}