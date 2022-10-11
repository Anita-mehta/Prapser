package com.prapser.prapser.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

public class SharedPre {


    private final Context context;
    SharedPreferences.Editor prefsEditor;
    SharedPreferences sharedpreferences;

    public SharedPre(Context context) {
        this.context = context;
        sharedpreferences = context.getSharedPreferences("Sepik", Context.MODE_PRIVATE);
        prefsEditor = sharedpreferences.edit();
    }

//    public <T> T getModel(String key, Class<T> type) {
//        Gson gson = new Gson();
//        return gson.fromJson(sharedpreferences.getString(key, ""), type);
//    }
//
//
//    public void saveModel(String key, Object modelClass) {
//        Gson gson = new Gson();
//        prefsEditor.putString(key, gson.toJson(modelClass));
//        prefsEditor.apply();
//    }

    public void saveString(String key, String value) {
        SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public String getString(String key) {
        return sharedpreferences.getString(key, "");
    }

//    public void saveUserLogin(String login){
//        prefsEditor.putString(AppConstant.LOGIN_KEY,login);
//        prefsEditor.commit();
//        Log.d("docWorld", "Save User Login");
//    }
//
//    public void userLogOut(){
//        prefsEditor.remove(AppConstant.LOGIN_KEY);
//        prefsEditor.commit();
//        Log.d("docWorld", "Save User Logout");
//    }
//
//    public boolean isUserLogin(){
//        boolean isUser = sharedpreferences.getString(AppConstant.LOGIN_KEY,"").isEmpty();
//        Log.d("docWorld", ""+isUser);
//        return !isUser;
//    }

}
