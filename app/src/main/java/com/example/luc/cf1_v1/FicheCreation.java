package com.example.luc.cf1_v1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FicheCreation extends AppCompatActivity {
    EditText edit;
    Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiche_creation);

            Button bouton = (Button) findViewById(R.id.creation);
            resultat = (Button) findViewById(R.id.resultat);


            tp = (EditText) findViewById (R.id.edit_poids);

            resultat.setOnClickListener(this);

        }
        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            String chaine = tp.getText().toString();
            Log.v("Essai",chaine);
        }
    }
}
