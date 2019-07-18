package com.example.intent_example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText e1 = (EditText) findViewById(R.id.e1);
        Button b = (Button) findViewById(R.id.but);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String name = e1.getText().toString();

                Intent i = new Intent (MainActivity.this,Main2Activity.class);
//                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.co.in"));
                i.putExtra("NAME",name);
                startActivity(i);
            }
        });

    }
}
