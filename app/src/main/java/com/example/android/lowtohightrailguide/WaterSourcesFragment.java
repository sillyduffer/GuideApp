package com.example.android.lowtohightrailguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class WaterSourcesFragment extends Fragment {

    public WaterSourcesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.object_list, container, false);

        final ArrayList<ListObject> items = new ArrayList<>();

        items.add(new ListObject("Badwater Basin", "Bring some water in the car to fill your initial capacity."));
        items.add(new ListObject("1st Road (Cache)", "The first road after the salt flats."));
        items.add(new ListObject("1st Canyon", "The first canyon has a spring, right before you climb to telescope ridge."));
        items.add(new ListObject("2nd Canyon", "The second spring is in the tuber canyon, after you drop of the ridge."));
        items.add(new ListObject("Paradise Cafe", "The first town on the trip."));
        items.add(new ListObject("darwinfalls", "Soon after Paradise Cafe this is lovely spring water."));
        items.add(new ListObject("China Springs", "Tastes like goldfish, drink at your own risk"));
        items.add(new ListObject("2nd Road (Cache)", "Crossing the highway; leave some water here on your way to the start."));
        items.add(new ListObject("Ghost Town", "Abandoned mining town. Sometimes the owner will be there giving a tour, if so there you can ask for water."));
        items.add(new ListObject("Lone Pine", "Real town, lots of water"));
        items.add(new ListObject("Whitney Portal", "Busy Campsite, lots of fresh water."));
        items.add(new ListObject("Lakes", "Many a lake on the climb to whitney, if you go for the mountaineers route."));

        LOAdapter itemsAdapter = new LOAdapter(getActivity(), items);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
