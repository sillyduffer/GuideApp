package com.example.android.lowtohightrailguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class HiddenTreasuresFragment extends Fragment {

    public HiddenTreasuresFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.object_list, container, false);

        final ArrayList<ListObject> items = new ArrayList<>();

        items.add(new ListObject("Salt Flats", "Large expanse of salty basin floor, lowest point, sometimes rough terrain.", R.drawable.saltflats));
        items.add(new ListObject("Hanaupah Canyon", "Lovely Spring", R.drawable.hanipahcanyon));
        items.add(new ListObject("Telescope Peak", "11,00' peak with a beautiful view, one hell of a climb to get there.", R.drawable.telescoperidge));
        items.add(new ListObject("Darwin Falls", "A beautiful hidden treasure right of the road, a bit of a scramble out.", R.drawable.falls));
        items.add(new ListObject("China Springs", "Abandoned shack, a small pool with goldfish!", R.drawable.chinasprings));
        items.add(new ListObject("Ghost Town", "Abandoned Mining town, verry cool.", R.drawable.cerrogordo));
        items.add(new ListObject("Slot Canyons", "tricky decent from the Inyo Mountains, pick your route carefully."));

        final LOAdapter itemsAdapter = new LOAdapter(getActivity(), items);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getActivity(), ImageActivity.class);
                i.putExtra(Intent.EXTRA_TEXT, itemsAdapter.getmImageResourceId());
                startActivity(i);
            }
        });
        return rootView;
    }

}
