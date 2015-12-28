package com.josenegretti.carnavaldeoruro2016;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button rolSabado;
    Button rolDomingo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rolSabado = (Button) findViewById(R.id.btSabado);
        rolDomingo = (Button) findViewById(R.id.btDomingo);
    }

    public void onClickRolSabado (View view){

        Intent i = new Intent(this, SabadoGrupos.class);
        startActivity(i);
    }

    public void onClickRolDomingo (View view){
        Intent r = new Intent(this, DomingoGrupos.class);
        startActivity(r);
    }
}
