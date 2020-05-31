package com.example.restopass.domain

data class Restaurant(
    val name: String,
    val img: String,
    val address: String,
    val tags: List<String>,
    val dishes: List<Dish>,
    val stars: Double
)