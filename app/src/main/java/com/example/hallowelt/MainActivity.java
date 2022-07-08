package com.example.hallowelt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText eTeingabe;
    TextView tVAusgabe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eTeingabe = findViewById(R.id.eTeingabe);
        tVAusgabe = findViewById(R.id.tVAusgabe);

    }
}
