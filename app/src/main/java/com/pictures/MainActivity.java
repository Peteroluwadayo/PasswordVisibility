package com.pictures;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ImageView jojo,pmai,mimi,ire,great1,momi,dede,fajji,babab,baba,aiden,fafa,family,pimi,sii,pilo,bae,bama,sese,amimi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initlistner();
    }
    public void initView(){
        jojo = findViewById(R.id.jojo);
        pmai = findViewById(R.id.pmai);
        mimi = findViewById(R.id.mimi);
        ire = findViewById(R.id.ire);
        great1 = findViewById(R.id.great1);
        momi = findViewById(R.id.momi);
        dede = findViewById(R.id.dede);
        fajji = findViewById(R.id.fajii);
        babab = findViewById(R.id.babab);
        baba = findViewById(R.id.baba);
        aiden = findViewById(R.id.aiden);
        fafa = findViewById(R.id.fafa);
        family = findViewById(R.id.family);
        pimi = findViewById(R.id.pimi);
        sii = findViewById(R.id.sii);
        pilo = findViewById(R.id.pilo);
        bae = findViewById(R.id.bae);
        bama = findViewById(R.id.bama);
        sese = findViewById(R.id.sese);
        amimi = findViewById(R.id.amimi);


    }
    public void initlistner(){
        jojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hey im having fun friends", Toast.LENGTH_SHORT).show();
            }
        });
        pmai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hey great is a young programmer", Toast.LENGTH_SHORT).show();
            }
        });
        mimi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hey this is tiwatope", Toast.LENGTH_SHORT).show();
            }
        });
        ire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hey im good", Toast.LENGTH_SHORT).show();
            }
        });
        great1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Great is one year old", Toast.LENGTH_SHORT).show();
            }
        });
        momi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hey my mom is a champion", Toast.LENGTH_SHORT).show();
            }
        });
        dede.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hey am great mom", Toast.LENGTH_SHORT).show();
            }
        });
        fajji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hey im riding my toy", Toast.LENGTH_SHORT).show();
            }
        });
        babab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hey im aiden", Toast.LENGTH_SHORT).show();
            }
        });
        baba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hey this aiden mummy's boy", Toast.LENGTH_SHORT).show();
            }
        });
        aiden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hey aiden is ridding his bicycle", Toast.LENGTH_SHORT).show();
            }
        });
        fafa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hey this is great mommy's favorite", Toast.LENGTH_SHORT).show();
            }
        });
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hey this is great mom and dad", Toast.LENGTH_SHORT).show();
            }
        });
        pimi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hey tiwatope is reciting A for Apple", Toast.LENGTH_SHORT).show();
            }
        });
        sii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hey im great hunsa", Toast.LENGTH_SHORT).show();
            }
        });
        pilo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hey this is great dad", Toast.LENGTH_SHORT).show();
            }
        });
        bae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hey this is miracle grandpa", Toast.LENGTH_SHORT).show();
            }
        });
        bama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "this is great grandma", Toast.LENGTH_SHORT).show();
            }
        });
        sese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hey this is aiden big aunty", Toast.LENGTH_SHORT).show();
            }
        });
        amimi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "hi everyone", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

