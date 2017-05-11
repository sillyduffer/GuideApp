package com.example.android.lowtohightrailguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

public class ResupplyFragment extends Fragment {

    public ResupplyFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.object_list, container, false);

        final ArrayList<ListObject> items = new ArrayList<>();

        items.add(new ListObject("Badwater Basin Parking Lot", 0.0, "Bring some water in the car to fill your initial capacity. Initial food supply."));
        items.add(new ListObject("Panamint Springs", 50, "First trail town, great burgers, spot to camp. Cache food here, there is very limited food to buy at the store. Reliable water."));
        items.add(new ListObject("Lone Pine", 110, "Real town, lots of water and food. There is a nice man at the gear shop who may let you cache gear here if you ask before hand."));
        items.add(new ListObject("Whitney Portal", 121, "Busy Campground, lots of fresh water and a small store."));

        LOAdapter itemsAdapter = new LOAdapter(getActivity(), items);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getActivity(), ImageActivity.class);
                Log.i(TAG, "onItemClick: " + i);
                i.putExtra("extraImage", items.get(position).getmImageResourceId());
                i.putExtra(Intent.EXTRA_TEXT,items.get(position).getmDescription());
                i.putExtra("extraTitle", items.get(position).getmTitle());
                startActivity(i);
            }
        });

        return rootView;
    }

}
