package com.example.matzipbot.restaurant.service

import com.example.matzipbot.RestaurantRequest
import com.example.matzipbot.RestaurantResponse
import com.example.matzipbot.restaurant.model.Restaurant
import com.example.matzipbot.restaurant.model.RestaurantTest.Companion.FIRST_RESTAURANT
import com.example.matzipbot.restaurant.repository.RestaurantRepository
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.*

internal class RestaurantServiceTest {


    private val restaurantRepository: RestaurantRepository = mockk()
    private val restaurantService: RestaurantService = RestaurantService(restaurantRepository)

    @Test
    fun `should create restaurants with given request`() {
        // given
        val request: RestaurantRequest = RestaurantRequest.newBuilder()
            .setName(FIRST_RESTAURANT.name)
            .setCategory(FIRST_RESTAURANT.category.category)
            .setLocation(FIRST_RESTAURANT.location)
            .setLink(FIRST_RESTAURANT.link).build()
        every { restaurantRepository.save(any()) } returns true

        // when

        val response: RestaurantResponse = restaurantService.create(request)

        // then
        equals(response, FIRST_RESTAURANT)
    }


    private fun equals(response: RestaurantResponse, restaurant: Restaurant) {
        assertThat(response.name).isEqualTo(restaurant.name)
        assertThat(response.category).isEqualTo(restaurant.getCategory())
        assertThat(response.totalRating).isEqualTo(restaurant.totalRating)
        assertThat(response.priceRating).isEqualTo(restaurant.priceRating)
        assertThat(response.numberOfEvaluationStaff).isEqualTo(restaurant.numberOfEvaluationStaff)
        assertThat(response.location).isEqualTo(restaurant.location)
        assertThat(response.link).isEqualTo(restaurant.link)
    }

}