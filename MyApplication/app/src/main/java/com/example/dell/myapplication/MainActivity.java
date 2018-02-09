package com.example.dell.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.dell.myapplication.adapter.Movie;
import com.example.dell.myapplication.adapter.MoviesAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public RecyclerView recyclerView;
    public MoviesAdapter moviesAdapter;
    private List<Movie> movieList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_view);
        recyclerView = findViewById(R.id.recycler_view);
        moviesAdapter = new MoviesAdapter(movieList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(moviesAdapter);
        prepareMovieData();
        //My first application to submit to git hub
    }

    private void prepareMovieData() {
        Movie movie = new Movie("Pokiri", "Action & Drama", "2005");
        movieList.add(movie);
        movie = new Movie("AAthadu", "Suspense and Action", "2003");
        movieList.add(movie);
        movie = new Movie("AAthadu", "Suspense and Action", "2003");
        movieList.add(movie);
        movie = new Movie("AAthadu", "Suspense and Action", "2003");
        movieList.add(movie);
        movie = new Movie("AAthadu", "Suspense and Action", "2003");
        movieList.add(movie);
        movie = new Movie("AAthadu", "Suspense and Action", "2003");
        movieList.add(movie);
        movie = new Movie("AAthadu", "Suspense and Action", "2003");
        movieList.add(movie);
        movie = new Movie("AAthadu", "Suspense and Action", "2003");
        movieList.add(movie);
        movie = new Movie("AAthadu", "Suspense and Action", "2003");
        movieList.add(movie);
        movie = new Movie("AAthadu", "Suspense and Action", "2003");
        movieList.add(movie);

        moviesAdapter.notifyDataSetChanged();
    }
}

