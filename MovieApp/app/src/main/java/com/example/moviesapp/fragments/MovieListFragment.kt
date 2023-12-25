package com.example.moviesapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.moviesapp.R
import com.example.moviesapp.databinding.FragmentFirstBinding
import com.example.moviesapp.models.Movie
import com.example.moviesapp.viewmodel.MovieListViewModel

class MovieListFragment : Fragment(R.layout.fragment_first) {
    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!
    private lateinit var movieListViewModel: MovieListViewModel
}
