package com.prapser.prapser.util;

import android.app.Application;
import android.content.Context;

public class App extends Application {

    private static SharedPre sharedPre;
    private static Context context;
    private static SingleModel singleTonModel;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();

        sharedPre = new SharedPre(context);
        singleTonModel = new SingleModel();
    }

    public static SharedPre getSharedPre() {
        return sharedPre;
    }

    public static SingleModel getSingleTonModel() {
        return singleTonModel;
    }

}
