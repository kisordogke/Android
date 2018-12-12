package com.example.user.hazinegy;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter {
    private final Activity context;
    private final Integer[] imageIDarray;
    private final String[] nameArray;
    private final String[] infoArray;
    private final String[] vasarlasArray;
    private final String[] eladasArray;


    public CustomListAdapter(Activity context, String[] nameArrayParam, String[] infoArrayParam, Integer[] imageIDArrayParam,
                             String[] vasarlasArray, String[] eladasArray) {

        super(context, R.layout.lista_row, nameArrayParam);
        this.context = context;
        this.imageIDarray = imageIDArrayParam;
        this.nameArray = nameArrayParam;
        this.infoArray = infoArrayParam;
        this.vasarlasArray = vasarlasArray;
        this.eladasArray = eladasArray;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.lista_row, null, true);

        //this code gets references to objects in the listview_row.xml file
        TextView nameTextField = (TextView) rowView.findViewById(R.id.nameId);
        TextView infoTextField = (TextView) rowView.findViewById(R.id.infoID);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView);
        TextView vasarlas = (TextView) rowView.findViewById(R.id.vasarID);
        TextView eladas = (TextView) rowView.findViewById(R.id.eladasId);

        //this code sets the values of the objects to values from the arrays
        nameTextField.setText(nameArray[position]);
        infoTextField.setText(infoArray[position]);
        imageView.setImageResource(imageIDarray[position]);
        vasarlas.setText(vasarlasArray[position]);
        eladas.setText(eladasArray[position]);

        return rowView;

    }
}

