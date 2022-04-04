package com.example.practical_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void makeCall(View v) {
        Intent i = new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:9904824249"));
        if (i.resolveActivity(getPackageManager()) != null) {
            startActivity(i);
        }
    }

    public void visitSite(View v) {
        Uri u= Uri.parse("http://www.spu.ac.in");
        Intent i = new Intent(Intent.ACTION_VIEW,u);
            startActivity(i);
    }
    public void searchLocation(View v) {
      //  Uri u= Uri.parse("geo:0,0?q=unjha%20Umiya%20mataji%20temple");
        EditText et=findViewById(R.id.ed1);
        String l=et.getText().toString();
        Uri u= Uri.parse("geo:0,0?q="+l);
        Intent i = new Intent(Intent.ACTION_VIEW,u);
        startActivity(i);
    }
}