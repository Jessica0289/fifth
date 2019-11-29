package com.example.fifthjob;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Toolbar;

public class Login extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        Button buttonR = (Button)findViewById(R.id.button_R);
        buttonR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Login.this,Registered.class);
                startActivity(intent1);
            }
        });

        Button buttonL = (Button)findViewById(R.id.button_l);
        buttonL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Login.this,Login2.class);
                startActivity(intent2);
            }
        });

        Button buttonS =(Button)findViewById(R.id.button_sina);
        buttonS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Login.this,"不可以使用新浪",Toast.LENGTH_SHORT).show();
            }
        });

        Button buttonT = (Button)findViewById(R.id.button_tencent);
        buttonT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Login.this,"也不可以使用",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }
}
