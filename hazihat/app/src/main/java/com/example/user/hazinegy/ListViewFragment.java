package com.example.user.hazinegy;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListViewFragment extends Fragment {
    protected static  final String frag2="2";

    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.listviewfragment, container, false);

    final String[] nameArray = {"EUR", "USD", "GBP", "AUD", "CAD", "CHF", "DKK", "HUF"};
    String[] infoArray = {"Euro", "USA dolar", "Angol lira", "Ausztriai dolar", "Kanadai dolar", "Svajci frank", "Dan korona", "Magyar forint"};
    Integer[] imageArray = {
            R.drawable.eur,
            R.drawable.usa,
            R.drawable.gbp,
            R.drawable.aud,
            R.drawable.can,
            R.drawable.chf,
            R.drawable.dnn,
            R.drawable.hun
    };

    final String[] vasarlasArray = {"4.55", "3.22", "6.00", "3.50", "5.80", "6.70", "2.69", "0.15"};
    String[] eladasArray = {"4.70", "3.40", "6.30", "3.70", "5.95", "6.90", "2.99", "0.18"};

        ListView listView = view.findViewById(R.id.currencies);

        CustomListAdapter adapter = new CustomListAdapter(getActivity(), nameArray, infoArray, imageArray, vasarlasArray, eladasArray);
        listView.setAdapter(adapter);

        final FragmentManager fragmentManager = getFragmentManager();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (fragmentManager.findFragmentByTag(frag2) != null) {
                    TextView selectedOpt = (TextView) getActivity().findViewById(R.id.selectedopt);
                    selectedOpt.setText("kivalasztva " + nameArray[position]  + vasarlasArray[position]);

                } else {


                    Intent intent = new Intent(getActivity().getApplicationContext(), PortraitShow.class);
                    intent.putExtra("name",nameArray[position]);
                    intent.putExtra("buy",vasarlasArray[position]);
                    startActivity(intent);
                }
            }
        });
        return view;
    }
}

