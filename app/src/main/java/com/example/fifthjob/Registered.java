package com.example.fifthjob;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.Toolbar;

public class Registered extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registered_layout);

        EditText editText1=(EditText)findViewById(R.id.edit_password);
        editText1.setTransformationMethod(PasswordTransformationMethod.getInstance());
    }

    private void setSupportActionBar(Toolbar toolbar2) {
    }
}
