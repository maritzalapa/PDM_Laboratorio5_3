package com.example.noa.laboratorio_53_1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lv;

    public static final String [] COMIDAS={ "arroz con pollo","ají de gallina","lomo saltado",
            "tacu tacu", "ceviche", "hostia que hambre me ha dado" };

    public static final String [] INGREDIENTES={ "arroz, pollo, choclo, arverja, ajos, perejil, condimentos",
                                                "ají amarillo, pechuga de gallina, pan o galleta, condimentos",
                                                "lomo de res, papas blancas, cebolla, tomate, condimentos",
                                                "mondongo, papa, arverja, cebolla, ajos, condimentos",
                                                "pescado, ají limo, limón, ajos, leche, condimentos",
                                                "ninguno" };
    public static final String [] TIEMPO_COCCION={ "1 hora","40 minutos","30 minutos",
            "1 hora", "30 minutos", "----------" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        lv = (ListView)findViewById(R.id.LstOpciones);

        //------------ACTVIDAD 1------------------- Descomentar para ver:
        //ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,
        //        android.R.layout.simple_list_item_1, android.R.id.text1 ,COMIDAS);
        //lv.setAdapter(adapter);

        ArrayList<HashMap<String, String>> foodList = new ArrayList<HashMap<String, String>>();;

        //------------ACTVIDAD 2-------------------Descomentar para ver:
        lv.setAdapter(new MyAdapter(this, COMIDAS, INGREDIENTES, TIEMPO_COCCION));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
