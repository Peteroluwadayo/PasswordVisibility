package com.pictures;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Visibility extends AppCompatActivity {
    private ImageButton imageButton1;
    private ImageButton imageButton2;
    private ImageButton imageButton3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visibility);

        initView();
        initListener();
    }
    public void initView(){
        imageButton1 = findViewById(R.id.iv_image);
        imageButton2 = findViewById(R.id.view);
        imageButton3 = findViewById(R.id.iv_view_image);

    }
    public void initListener(){
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Visibility.this, "image one", Toast.LENGTH_SHORT).show();
                imageButton3.setVisibility(View.GONE);
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Visibility.this, "image two", Toast.LENGTH_SHORT).show();
                imageButton3.setVisibility(View.VISIBLE);

            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Visibility.this, "image three", Toast.LENGTH_SHORT).show();
            }
        });
    }
}