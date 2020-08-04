package com.approcket.sharedpreference;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefernceConfig {
    private Context context;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    public SharedPrefernceConfig (Context context)
    {
        this.context=context;
        sharedPreferences=context.getSharedPreferences(context.getString(R.string.login_preference),Context.MODE_PRIVATE);
        editor=sharedPreferences.edit();
    }

    public void writeSharedPreference(boolean status)
    {
        editor.putBoolean(context.getResources().getString(R.string.login_status_preference),status);
        editor.commit();
    }
    public boolean readSharedPrefernce()
    {
        boolean status=false;
        status=sharedPreferences.getBoolean(context.getResources().getString(R.string.login_status_preference),false);
        return  status;
    }
}
