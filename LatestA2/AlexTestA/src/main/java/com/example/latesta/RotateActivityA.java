package com.example.latesta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
//Author Alex La
public class RotateActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void callIntent(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.AlexButton01:
                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.google.ca"));
                startActivity(intent);
                break;
            case R.id.AlexButton02:
                intent = new Intent(Intent.ACTION_CALL,
                        Uri.parse("tel:(416)289-5000"));
                startActivity(intent);
                break;

            case R.id.AlexButton03:
                Intent intent1 = new Intent("android.media.action.ACTION_DIAL");
                startActivity(intent1);
                break;
            default:
                break;
        }
    }
}