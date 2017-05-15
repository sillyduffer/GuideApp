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

        items.add(new ListObject(getString(R.string.salt_flats_title), 3, getString(R.string.salt_fats_description), R.drawable.saltflatssmall));
        items.add(new ListObject(getString(R.string.h_canyon_title), 15.5, getString(R.string.h_canyon_description), R.drawable.hanipahcanyonsmall));
        items.add(new ListObject(getString(R.string.t_peak_title), 20, getString(R.string.t_peak_description), R.drawable.telescoperidgesmall));
        items.add(new ListObject(getString(R.string.d_falls_title), 54, getString(R.string.d_falls_description), R.drawable.darwincanyonsmall));
        items.add(new ListObject(getString(R.string.c_g_springs_title), 55, getString(R.string.c_g_springs_description), R.drawable.chinaspringssmall));
        items.add(new ListObject(getString(R.string.ghost_town_title), 87, getString(R.string.ghost_town_description), R.drawable.cerrogordosmall));
        items.add(new ListObject(getString(R.string.l_j_canyon_title), 99, getString(R.string.l_j_canyon_description)));
        items.add(new ListObject(getString(R.string.m_whitney_sum_title), 130, getString(R.string.m_whitney_description), R.drawable.whitneysumitsmall));

        final LOAdapter itemsAdapter = new LOAdapter(getActivity(), items);

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
