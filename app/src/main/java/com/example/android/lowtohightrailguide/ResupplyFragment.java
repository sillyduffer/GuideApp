package com.example.android.lowtohightrailguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ResupplyFragment extends Fragment {

    public ResupplyFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.object_list, container, false);

        final ArrayList<ListObject> items = new ArrayList<>();

        items.add(new ListObject("Badwater Basin", "Starting Point, lowest point in the northern hemisphere"));
        items.add(new ListObject("Paradise Cafe", "First trail town, great burgers, spot to camp. Cache food here, there is very limited food to buy at the store."));
        items.add(new ListObject("Lone Pine", "Large town after the Inyo Mountains, everything you might need."));
        items.add(new ListObject("Whitney Portal", "Large campground, good place to rest before the climb if you have the time."));
        items.add(new ListObject("Whitney Summit", "Finishing Point, highest point in the lower 48 states."));

        LOAdapter itemsAdapter = new LOAdapter(getActivity(), items);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
