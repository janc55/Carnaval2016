package com.josenegretti.carnavaldeoruro2016;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by José on 21/12/2015.
 */
public class SabadoGrupos extends Activity {

    Button grupo1;
    Button grupo2;
    Button grupo3;
    Button grupo4;
    Button grupo5;
    Button grupo6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sabado_grupos);

        grupo1 = (Button) findViewById(R.id.btGrupo1);
        grupo2 = (Button) findViewById(R.id.btGrupo2);
        grupo3 = (Button) findViewById(R.id.btGrupo3);
        grupo4 = (Button) findViewById(R.id.btGrupo4);
        grupo5 = (Button) findViewById(R.id.btGrupo5);
        grupo6 = (Button) findViewById(R.id.btGrupo6);

    }

    public void onClickRolSabado (View view){

        setContentView(R.layout.grupo_1);
    }
    

}
