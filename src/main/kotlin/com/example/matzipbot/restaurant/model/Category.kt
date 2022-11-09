package com.example.matzipbot.restaurant.model

enum class Category(val category: String, val imageUrl: String) {
    KOREAN("한식", "https://cdn-icons-png.flaticon.com/512/1999/1999653.png"),
    WESTERN("양식", "https://cdn-icons-png.flaticon.com/512/2515/2515207.png"),
    CHINESE("중식", "https://cdn-icons-png.flaticon.com/512/673/673530.png"),
    JAPANESE("일식", "https://cdn-icons-png.flaticon.com/512/2252/2252075.png"),
    ASIAN("아시안", "https://cdn-icons-png.flaticon.com/512/1531/1531382.png");

    companion object {
        fun of(category: String): Category = try {
            Category.values().first { it.category == category }
        } catch (e: NoSuchElementException) {
            throw NoSuchElementException("Category named $category does not exists.")
        }
    }
}