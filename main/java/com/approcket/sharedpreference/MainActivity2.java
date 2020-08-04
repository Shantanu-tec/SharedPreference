package com.approcket.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private SharedPrefernceConfig sharedPrefernceConfig;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView=findViewById(R.id.text);
        button=findViewById(R.id.btn);
        sharedPrefernceConfig=new SharedPrefernceConfig(this);
        textView.setText(R.string.username);
    }

    public void signOUT(View view) {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
        sharedPrefernceConfig.writeSharedPreference(false);
    }
}