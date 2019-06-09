package com.example.android.leicester;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A {@link Fragment} subclass displaying bars in Leicester.
 */
public class BarFragment extends Fragment {

    public BarFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        //Create a list of bars
        final ArrayList<Attraction> bars = new ArrayList<>();
        bars.add(new Attraction(getString(R.string.rileys_title), getString(R.string.rileys_description),
                getString(R.string.rileys_hours), "none"));
        bars.add(new Attraction(getString(R.string.soar_title), getString(R.string.soar_description),
                getString(R.string.soar_hours), "none"));
        bars.add(new Attraction(getString(R.string.firebug_title), getString(R.string.firebug_description),
                getString(R.string.firebug_hours), "none"));
        bars.add(new Attraction(getString(R.string.brewdog_title), getString(R.string.brewdog_description),
                getString(R.string.brewdog_hours), "none"));

        //Create an {@link AttractionAdapter}, whose data source is a list of Attractions.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), bars, R.color.white);

        // Find the ListView object.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the ListView use the AttractionAdapter we created above.
        listView.setAdapter(adapter);

        return rootView;
    }
}