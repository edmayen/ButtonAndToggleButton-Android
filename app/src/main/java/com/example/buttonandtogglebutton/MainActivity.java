package com.example.buttonandtogglebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnCancel;
    private Button btnSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCancel = (Button)findViewById(R.id.btnCancel);
        btnSave = (Button)findViewById(R.id.btnSave);
        btnCancel.setOnClickListener(this);
        btnSave.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSave:
                Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnCancel:
                Toast.makeText(getApplicationContext(), "Canceled", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}