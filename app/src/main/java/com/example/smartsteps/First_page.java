package com.example.smartsteps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class First_page extends AppCompatActivity {
    ImageView button;
    ImageView button2;
    ImageView button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_page);
        button2=findViewById(R.id.btn_for_editor);
        button3=findViewById(R.id.imageView5);
    button=findViewById(R.id.first_page_button);
    button3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openQR();
        }
    });
    button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openEditor();
        }
    });
    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            openApp();

        }
    });
    }
    public void openEditor(){
        startActivity(new Intent(First_page.this,EditImageActivity.class));
        finish();
    }
    public void openApp(){
        startActivity(new Intent(First_page.this,MainActivity.class));
        finish();
    }
    public void openQR(){
        startActivity(new Intent(First_page.this,QRScanner.class));
        finish();
    }

}
