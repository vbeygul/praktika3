package com.mirea.vbeygul.systemintentsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickCall(View v){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:89859121203"));
        startActivity(intent);
    }

    public void onClickBrowser(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://ya.ru/"));
        startActivity(intent);
    }

    public void onClickMap(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:34.688739, 32.430390"));
        startActivity(intent);
    }
}