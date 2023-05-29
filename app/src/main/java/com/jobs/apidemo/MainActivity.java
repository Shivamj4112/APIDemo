package com.jobs.apidemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

import java.io.UnsupportedEncodingException;

public class MainActivity extends AppCompatActivity {

    TextInputEditText edtPassword;
    MaterialButton btnClose;
    String text = "QW5kcm9pZA==";
    private static final String TAG = "MainActivity";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtPassword = findViewById(R.id.txtPassword);
        btnClose = findViewById(R.id.btnClose);

        btnClose.setOnClickListener(view -> {
            checkPassword();

        });


    }

    private void checkPassword() {
        byte[] data = Base64.decode(text, Base64.DEFAULT);
        try {
            String text = new String(data, "UTF-8");

            if (edtPassword.getText().toString().matches(text)) {
//                Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            } else {

                ProgressDialog dialog = new ProgressDialog(MainActivity.this);
                dialog.setMessage("Loading");
                dialog.create();
                dialog.show();

                Toast.makeText(this, "Login Success wait until Process", Toast.LENGTH_SHORT).show();
            }

        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}