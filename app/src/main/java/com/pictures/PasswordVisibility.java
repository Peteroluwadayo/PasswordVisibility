package com.pictures;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.BaseMenuPresenter;

import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class PasswordVisibility extends AppCompatActivity {
    private EditText passWordEditText;
    private CheckBox showButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_visibility);

        initView();
        initListener();
    }

    public void initView() {
        passWordEditText = findViewById(R.id.pwd);
        showButton = findViewById(R.id.showHideBtn);
    }

    public void initListener() {
        showButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(!isChecked){

                    // show password
                    passWordEditText.setTransformationMethod(PasswordTransformationMethod.getInstance());

                    Log.i("checker", "true");
                }

                else{
                    Log.i("checker", "false");

                    // hide password
                    passWordEditText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }

            }
        });

    }
}