package com.example.moviesapp.models

class Movie (
    val id: Int,
    val name: String,
    val description: String,
    val director: String,
    val actors: List<String>
)