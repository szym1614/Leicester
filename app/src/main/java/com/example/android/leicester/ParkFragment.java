package com.example.android.leicester;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A {@link Fragment} subclass displaying parks in Leicester.
 */
public class ParkFragment extends Fragment {

    public ParkFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        //Create a list of parks
        final ArrayList<Attraction> parks = new ArrayList<>();
        parks.add(new Attraction(getString(R.string.bede_title), getString(R.string.bede_description),
                R.drawable.park_rating));
        parks.add(new Attraction(getString(R.string.victoria_title), getString(R.string.victoria_description),
                R.drawable.victoria_rating));
        parks.add(new Attraction(getString(R.string.castle_title), getString(R.string.castle_description),
                R.drawable.park_rating));
        parks.add(new Attraction(getString(R.string.nelson_title), getString(R.string.nelson_description),
                R.drawable.park_rating));

        //Create an {@link AttractionAdapter}, whose data source is a list of Attractions.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), parks, R.color.white);

        // Find the ListView object.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the ListView use the AttractionAdapter we created above.
        listView.setAdapter(adapter);

        return rootView;
    }
}