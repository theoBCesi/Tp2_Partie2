package com.example.tristans.windowtowindow;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import classes.Personne;

public class PersonneActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personne);
        Personne d = this.getIntent().getParcelableExtra("personne");
        TextView textPrenom = (TextView) findViewById(R.id.textViewPrenom);
        TextView textNom = (TextView)findViewById(R.id.textViewNom);
        textPrenom.setText("Prénom : "+d.getPrenom());
        textNom.setText("Nom : "+d.getNom());
    }
}
