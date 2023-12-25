package com.example.moviesapp.adapter

import android.view.View
import android.view.View.OnClickListener
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesapp.models.Movie

class MovieAdapter(
    private val movies: ArrayList<Movie> = ArrayList(),
    private val onClickListener: OnClickListener
) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {
    class MovieViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }
}
