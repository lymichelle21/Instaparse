package com.example.instaparse;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("WlCrtaNZeSI1UZ2WNgvjLk4thfbkPFEfEAhSrQYZ")
                .clientKey("PpZsoqqcbOI4YEBNLRE9IwST0wdO9GzXZRf7VWRY")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
