package com.example.android.lowtohightrailguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class LOAdapter extends ArrayAdapter<ListObject> {

    private int mImageResourceId;

    public LOAdapter(Activity context, ArrayList<ListObject> ourWords) {
        super(context, 0, ourWords);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        ListObject currentLO = getItem(position);

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.list_title);
        titleTextView.setText(currentLO.getmTitle());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.list_description);
        descriptionTextView.setText(currentLO.getmDescription());

        mImageResourceId = currentLO.getmImageResourceId();

        return listItemView;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

}
