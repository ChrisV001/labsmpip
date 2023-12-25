package com.example.moviesapp.data

import com.example.moviesapp.models.Movie

class FakeApi {
    private val movies: MutableList<Movie> = ArrayList()

    fun getAllMovies():List<Movie> {
        return movies
    }

    fun addMovie(movie: Movie) {
        movies.add(movie)
    }
}