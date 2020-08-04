package com.approcket.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText username,password;
    private Button  btn;
    private SharedPrefernceConfig sharedPrefernceConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        sharedPrefernceConfig=new SharedPrefernceConfig(this);
        if (sharedPrefernceConfig.readSharedPrefernce())
        {
            startActivity(new Intent(this,MainActivity2.class));
            finish();
        }
    }

    public void move(View view) {
        String user=username.getText().toString();
        String pass=password.getText().toString();

        if(user.equals("Shantanu")&&pass.equals("chaudhary"))
        {
            Intent i=new Intent(this,MainActivity2.class);
            startActivity(i);
            finish();
            sharedPrefernceConfig.writeSharedPreference(true);
        }
        else{
            Toast.makeText(this, "login failed", Toast.LENGTH_SHORT).show();
            username.setText("");
            password.setText("");
        }
    }
}