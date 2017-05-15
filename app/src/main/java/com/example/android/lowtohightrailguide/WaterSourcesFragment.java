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

        items.add(new ListObject(getString(R.string.b_basin_lot_title), 0.0, getString(R.string.b_basin_lot_description)));
        items.add(new ListObject(getString(R.string.h_c_road_title), 6.4, getString(R.string.h_c_road_description), R.drawable.hanipahcanyonsmall));
        items.add(new ListObject(getString(R.string.h_spring_title), 15.5, getString(R.string.h_spring_description)));
        items.add(new ListObject(getString(R.string.t_spring_title), 27, getString(R.string.t_spring_description)));
        items.add(new ListObject(getString(R.string.t_w_road_title), 34, getString(R.string.t_w_road_description)));
        items.add(new ListObject(getString(R.string.w_campground_title), 34, getString(R.string.w_campground_description)));
        items.add(new ListObject(getString(R.string.p_springs_title), 50, getString(R.string.p_springs_description)));
        items.add(new ListObject(getString(R.string.d_falls_title), 54, getString(R.string.d_falls_description), R.drawable.darwincanyonsmall));
        items.add(new ListObject(getString(R.string.c_g_springs_title), 55, getString(R.string.c_g_springs_description), R.drawable.chinaspringssmall));
        items.add(new ListObject(getString(R.string.h_190_title), 62, getString(R.string.h_190_description)));
        items.add(new ListObject(getString(R.string.ghost_town_title), 87, getString(R.string.ghost_town_description), R.drawable.cerrogordosmall));
        items.add(new ListObject(getString(R.string.m_spring_title), 92, getString(R.string.m_spring_description)));
        items.add(new ListObject(getString(R.string.l_j_c_spring_title), 102, getString(R.string.l_j_c_spring_description)));
        items.add(new ListObject(getString(R.string.o_l_p_road_title), 106, getString(R.string.o_l_p_road_description)));
        items.add(new ListObject(getString(R.string.o_river_title), 107, getString(R.string.o_river_description)));
        items.add(new ListObject(getString(R.string.l_pine_title), 110, getString(R.string.l_pine_description)));
        items.add(new ListObject(getString(R.string.l_p_campground_title), 117, getString(R.string.l_p_campground_description)));
        items.add(new ListObject(getString(R.string.l_p_creek_title), 119, getString(R.string.l_p_creek_description)));
        items.add(new ListObject(getString(R.string.w_portal_title), 121, getString(R.string.w_portal_description)));
        items.add(new ListObject(getString(R.string.c_l_title), 126, getString(R.string.c_l_description)));

        LOAdapter itemsAdapter = new LOAdapter(getActivity(), items);

        final ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getActivity(), DetailPageActivity.class);
                Log.i(TAG, getString(R.string.on_item_click) + i);
                i.putExtra(getString(R.string.extra_image), items.get(position).getmImageResourceId());
                i.putExtra(Intent.EXTRA_TEXT, items.get(position).getmDescription());
                i.putExtra(getString(R.string.extra_title), items.get(position).getmTitle());
                startActivity(i);
            }
        });

        return rootView;
    }

}
