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


public class HiddenTreasuresFragment extends Fragment {

    public HiddenTreasuresFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.object_list, container, false);

        final ArrayList<ListObject> items = new ArrayList<>();

        items.add(new ListObject("Salt Flats", 3, "Large expanse of salty basin floor, lowest point, sometimes rough terrain.", R.drawable.saltflatssmall));
        items.add(new ListObject("Hanaupah Canyon", 15.5, "Lovely Spring", R.drawable.hanipahcanyonsmall));
        items.add(new ListObject("Telescope Peak", 20, "11,00' peak with a beautiful view, one hell of a climb to get there.", R.drawable.telescoperidgesmall));
        items.add(new ListObject("Darwin Falls", 54, "A beautiful hidden treasure right of the road, a bit of a scramble out.", R.drawable.darwincanyonsmall));
        items.add(new ListObject("China Garden Springs", 55, "Abandoned shack, a small pool with goldfish! Water tastes very fishy, drink at your own risk.", R.drawable.chinaspringssmall));
        items.add(new ListObject("Cerro Gordo ghost town", 87, "Abandoned mining town, very cool! Sometimes the owner will be there giving a tour, if so there you can ask for water. Caching water here is possible if vehicle can make it up the road.", R.drawable.cerrogordosmall));
        items.add(new ListObject("Long John Canyon", 99, "tricky decent from the Inyo Mountains, pick your route carefully."));
        items.add(new ListObject("Mt.Whitney Summit", 130, "Summit of Mt Whitney (14,505'), southern terminus of the John Muir Trail (western terminus of L2H).", R.drawable.whitneysumitsmall));

        final LOAdapter itemsAdapter = new LOAdapter(getActivity(), items);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getActivity(), DetailPageActivity.class);
                Log.i(TAG, "onItemClick: " + i);
                i.putExtra("extraImage", items.get(position).getmImageResourceId());
                i.putExtra(Intent.EXTRA_TEXT, items.get(position).getmDescription());
                i.putExtra("extraTitle", items.get(position).getmTitle());
                startActivity(i);
            }
        });
        return rootView;
    }

}
