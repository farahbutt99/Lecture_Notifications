package com.example.notifications_practice;

import android.app.Application;

public class App extends Application {
    public static final String CHANNEL_1_ID = "channel1";
    public static final String CHANNEL_2_ID = "channel2";
    public static final String CHANNEL_3_ID = "channel3";
    public void onCreate() {
        super.onCreate();
        //createNotificationChannels();
    }
}
