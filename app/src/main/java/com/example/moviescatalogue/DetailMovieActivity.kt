package com.example.moviescatalogue

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class DetailMovieActivity : AppCompatActivity() {

    lateinit var ivCoverPoster: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movie)

        ivCoverPoster = findViewById(R.id.ivCoverPoster)
//        val movieData = intent.getSerializableExtra("MovieData") as MoviesList?
        @Suppress("Deprecation")
        val movieData = intent.getParcelableExtra("MovieData") as MoviesList?
        Glide.with(this).load(movieData?.image).into(ivCoverPoster)
    }
}