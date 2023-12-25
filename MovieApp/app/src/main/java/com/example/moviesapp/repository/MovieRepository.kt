package com.example.moviesapp.repository

import com.example.moviesapp.data.FakeApi
import com.example.moviesapp.models.Movie

class MovieRepository(private val movieDatabaseApi: FakeApi) {
    fun listMovies(): List<Movie> {
        return movieDatabaseApi.getAllMovies()
    }
    fun getMovie(movieId: String): Movie {
        val movies = movieDatabaseApi.getAllMovies()
        val movie = movies.find { it.id.toString() == movieId }
        return movie!!
    }

    fun addMovie(name: String, description: String, director: String, actors: List<String>): List<Movie> {
        val movie = Movie(movieDatabaseApi.getAllMovies().size + 1, name, description, director, actors)
        movieDatabaseApi.addMovie(movie)
        return movieDatabaseApi.getAllMovies()
    }
}