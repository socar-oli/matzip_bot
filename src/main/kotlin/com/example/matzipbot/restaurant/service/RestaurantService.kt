package com.example.matzipbot.restaurant.service

import com.example.matzipbot.RestaurantRequest
import com.example.matzipbot.RestaurantResponse
import com.example.matzipbot.restaurant.model.Restaurant
import com.example.matzipbot.restaurant.repository.RestaurantRepository
import org.springframework.stereotype.Service


@Service
class RestaurantService(val restaurantRepository: RestaurantRepository) {

    fun create(request: RestaurantRequest):RestaurantResponse {
        val restaurant = Restaurant(request)
        restaurantRepository.save(restaurant)
        return toResponse(restaurant)
    }

    private fun toResponse(restaurant: Restaurant) = RestaurantResponse.newBuilder()
        .setName(restaurant.name)
        .setCategory(restaurant.getCategory())
        .setTotalRating(restaurant.totalRating)
        .setPriceRating(restaurant.priceRating)
        .setNumberOfEvaluationStaff(restaurant.numberOfEvaluationStaff)
        .setLocation(restaurant.location)
        .setLink(restaurant.link).build()
}