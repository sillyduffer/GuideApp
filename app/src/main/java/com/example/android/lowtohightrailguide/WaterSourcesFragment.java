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

        items.add(new ListObject("Badwater Basin Parking Lot", 0.0, "Bring some water in the car to fill your initial capacity. Initial food supply."));
        items.add(new ListObject("Hanaupah Canyon Rd (Cache)", 6.4, "The first road after the salt flats.", R.drawable.hanipahcanyon));
        items.add(new ListObject("Hanaupah Spring", 15.5,"The first canyon has a spring, right before you climb to telescope ridge. Before you begin your trek, call the ranger station and check if the spring is flowing."));
        items.add(new ListObject("Tuber Spring", 27, "The second spring is in Tuber canyon, after you drop of the ridge."));
        items.add(new ListObject("Trona-Wildrose Rd (Cache)", 34, "Four Miles offroute."));
        items.add(new ListObject("Wildrose Campground", 34, "Four miles offroute, reliable water."));
        items.add(new ListObject("Panamint Springs", 50, "First trail town, great burgers, spot to camp. Cache food here, there is very limited food to buy at the store. Reliable water."));
        items.add(new ListObject("Darwin Falls", 55, "Soon after Paradise Cafe this is lovely spring water.", R.drawable.darwincanyon));
        items.add(new ListObject("China Garden Spring", 56, "Abandoned shack, a small pool with goldfish! Water tastes very fishy, drink at your own risk.", R.drawable.chinasprings));
        items.add(new ListObject("Highway 190 (Cache)", 62, "Crossing the highway at Saline Valley Rd; leave some water here on your way to the start."));
        items.add(new ListObject("Cerro Gordo ghost town (cache)", 87, "Abandoned mining town, very cool! Sometimes the owner will be there giving a tour, if so there you can ask for water. Caching water here is possible if vehicle can make it up the road.", R.drawable.cerrogordo));
        items.add(new ListObject("Mexican Spring", 92, "Possible spring depending on snow melt."));
        items.add(new ListObject("Long John Canyon Spring", 102, "Very unreliable spring, often hard to get to. Can be hard to find in the slot canyons."));
        items.add(new ListObject("Owenyo-Lone Pine Rd (Cache)", 106, "Long dirt road, possible cache site. Road is possible for most vehicles"));
        items.add(new ListObject("Owens River", 107, "Large river, not the cleanest."));
        items.add(new ListObject("Lone Pine", 110, "Real town, lots of water and food. There is a nice man at the gear shop who may let you cache gear here if you ask before hand."));
        items.add(new ListObject("Lone Pine Campground", 117, "Small campground outside of town. Reliable spigots and bathrooms."));
        items.add(new ListObject("Lone Pine Creek", 119, "Nice little creek on the Whitney portal trail."));
        items.add(new ListObject("Whitney Portal", 121, "Busy Campground, lots of fresh water and a small store."));
        items.add(new ListObject("Creek and Lakes", 126, "Many a lake on the climb to whitney, for both the mountaineers route and main Mt. Whiney trail."));

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
