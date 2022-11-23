package com.anurag.callapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {
    EditText web;
    Button visit;
    ImageView im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        web=findViewById(R.id.web);
        visit=findViewById(R.id.visit);
        visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String webadd=web.getText().toString();
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://"+webadd));
                startActivity(intent);
            }
        });



    }
}