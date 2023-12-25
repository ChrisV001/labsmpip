package com.example.moviesapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.moviesapp.models.Movie
import androidx.lifecycle.*
import com.example.moviesapp.data.FakeApi
import com.example.moviesapp.data.FakeApiProvider
import com.example.moviesapp.repository.MovieRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieListViewModel (private val movieRepository: MovieRepository) : ViewModel() {
    private val moviesLiveData = MutableLiveData<List<Movie>>()
    fun getMovieLiveData(): LiveData<List<Movie>> = moviesLiveData
    fun listAll() {
        viewModelScope.launch(Dispatchers.IO) {
            val movies = movieRepository.listMovies()
            moviesLiveData.postValue(movies)
        }
    }
}
