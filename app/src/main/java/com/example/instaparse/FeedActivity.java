package com.example.instaparse;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FeedActivity extends AppCompatActivity {

    private RecyclerView rvPosts;
    protected PostsAdapter adapter;
    protected List<Post> allPosts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
        rvPosts = findViewById(R.id.rvPosts);
        allPosts = new ArrayList<>();
        adapter = new PostsAdapter(this, allPosts);
    }

}
