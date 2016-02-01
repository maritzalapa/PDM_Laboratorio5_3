package com.example.noa.laboratorio_53_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by noa on 01/02/16.
 */
public class MyAdapter extends ArrayAdapter<String>{

    private Context context;
    private String[] foodStr;
    private String[] ingrStr;
    private String[] timeStr;

    public MyAdapter(Context context, String[] food, String[] ingr, String[] time){
        super(context, R.layout.field_list, food);
        this.context = context;
        foodStr = food;
        ingrStr = ingr;
        timeStr = time;
    }

    @Override
    public View getView(int ind, View view, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //Obtiene campos de la vista
        View _view = inflater.inflate(R.layout.field_list,parent,false);
        TextView txtVname = (TextView) _view.findViewById(R.id.name);
        TextView txtVingredients = (TextView) _view.findViewById(R.id.ingredients);
        TextView txtVtime = (TextView) _view.findViewById(R.id.time);

        //Seteamos los valores
        txtVname.setText(foodStr[ind]);
        txtVingredients.setText(ingrStr[ind]);
        txtVtime.setText(timeStr[ind]);

        return _view;
    }
}
