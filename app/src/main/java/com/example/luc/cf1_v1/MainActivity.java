package com.example.luc.cf1_v1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.inscription = (TextView) findViewById(R.id.inscription);

        inscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(), Inscription.class);
                startActivity(otherActivity);
                finish();
            }
        }

        this.visiteur = (TextView) findViewById(R.id.visiteur);

        visiteur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(), visiteur.class);
                startActivity(otherActivity);
                finish();
            }
    }
}