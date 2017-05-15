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

        items.add(new ListObject(getString(R.string.b_basin_lot_title), 0.0, getString(R.string.b_basin_lot_description)));
        items.add(new ListObject(getString(R.string.p_springs_title), 50, getString(R.string.p_springs_description)));
        items.add(new ListObject(getString(R.string.l_pine_title), 110, getString(R.string.l_pine_description)));
        items.add(new ListObject(getString(R.string.w_portal_title), 121, getString(R.string.w_portal_description)));

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
