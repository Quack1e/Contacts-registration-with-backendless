package com.martin.training.backendlesscontactsapp;

import android.app.Application;

import com.backendless.Backendless;

public class appClass extends Application {

    public static final String APPLICATION_ID = "F38C7A02-0E56-C6FA-FFA6-160AA179F900";
    public static final String API_KEY = "B431C9FB-EB0F-4106-8E95-1CF6D235EA74";
    public static final String SERVER_URL = "https://api.backendless.com";

    @Override
    public void onCreate() {
        Backendless.setUrl(SERVER_URL);
        Backendless.initApp(getApplicationContext(), API_KEY, APPLICATION_ID);
        super.onCreate();
    }
}
