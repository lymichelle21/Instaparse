package com.example.instaparse;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.parse.ParseFile;

import org.parceler.Parcels;

import java.io.File;

public class PostDetailsActivity extends AppCompatActivity {
    Context context;
    Post post;

     TextView tvUsername;
     ImageView ivImage;
     TextView tvDescription;
     TextView tvTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        tvUsername = (TextView) findViewById(R.id.tvUsername);
        ivImage = (ImageView) findViewById(R.id.ivImage);
        tvDescription = (TextView) findViewById(R.id.tvDescription);
        tvTime = (TextView) findViewById(R.id.tvTime);

        post = (Post) Parcels.unwrap(getIntent().getParcelableExtra(Post.class.getSimpleName()));

        tvDescription.setText(post.getDescription());
        tvUsername.setText(post.getUser().getUsername());
        tvTime.setText("INSERT TIME HERE");

        ParseFile image = post.getImage();
        if (image != null) {
            Glide.with(getApplicationContext()).load(image.getUrl()).into(ivImage);
        }

    }


}
