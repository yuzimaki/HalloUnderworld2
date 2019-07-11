package com.qm.example.hallounderworld;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1=findViewById(R.id.btn_click_one);
        final EditText ett1=findViewById(R.id.et_phone);
        final EditText ett2=findViewById(R.id.et_password);
        final TextView tvw=findViewById(R.id.textView);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this,"Log in to the secondary interface",
                        Toast.LENGTH_LONG).show();
                tvw.setText("Hallo World!");
                Log.d("MainActivity","World");
                }
        });
        Log.d("MainActivity","Hallo");

    }

}

