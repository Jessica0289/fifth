package com.example.fifthjob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;

public class Login2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login2_layout);

        EditText editText2 = (EditText)findViewById(R.id.edit_password2);
        editText2.setTransformationMethod(PasswordTransformationMethod.getInstance());
    }
}
