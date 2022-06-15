package com.example.instaparse;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.parceler.Parcels;

import java.io.File;

public class PostDetailsActivity extends AppCompatActivity {
    Context context;
    Post post;

     TextView tvUsername;
     ImageView ivImage;
     TextView tvDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        tvUsername = (TextView) findViewById(R.id.tvUsername);
        ivImage = (ImageView) findViewById(R.id.ivImage);
        tvDescription = (TextView) findViewById(R.id.tvDescription);

    }


}
