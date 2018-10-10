package com.example.tristans.windowtowindow;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import classes.Personne;

public class MainActivity extends Activity {

    Activity lecontext;
    EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lecontext = this;
        Button btaction = (Button) findViewById(R.id.buttonSubmit);
        btaction.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Personne personne = new Personne();
                text=(EditText)findViewById(R.id.editNom);
                personne.setNom(text.getText().toString());
                text=(EditText)findViewById(R.id.editPrenom);
                personne.setPrenom(text.getText().toString());
                text=(EditText)findViewById(R.id.editAge);
                personne.setAge(Integer.parseInt(text.getText().toString()));

                Log.d("Personne",""+personne.getNom()+" - "+personne.getPrenom()+" - "+personne.getAge().toString());

                Intent defineIntent = new Intent(lecontext, PersonneActivity.class);
                Bundle objetbunble = new Bundle();
                objetbunble.putParcelable("personne", personne); // on passe notre objet a notre activities
                defineIntent.putExtras(objetbunble);

                lecontext.startActivity(defineIntent);
            }
        });
    }
}
