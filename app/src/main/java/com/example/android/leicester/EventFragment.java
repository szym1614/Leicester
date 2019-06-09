package com.example.android.leicester;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A {@link Fragment} subclass displaying events in Leicester.
 */
public class EventFragment extends Fragment {

    public EventFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        //Create a list of events
        final ArrayList<Attraction> events = new ArrayList<>();
        events.add(new Attraction(getString(R.string.forbidden_planet_event), getString(R.string.demontfort_event),
                "none", getString(R.string.march_26)));
        events.add(new Attraction(getString(R.string.black_honey_event), getString(R.string.o2_event),
                "none", getString(R.string.march_29)));
        events.add(new Attraction(getString(R.string.mechanics_event), getString(R.string.demontfort_event),
                "none", getString(R.string.march_29)));
        events.add(new Attraction(getString(R.string.literature_event), getString(R.string.demontfort_event),
                "none", getString(R.string.march_30)));
        events.add(new Attraction(getString(R.string.rock_event), getString(R.string.firebug_event),
                "none", getString(R.string.march_30)));
        events.add(new Attraction(getString(R.string.experience_event), getString(R.string.demontfort_event),
                "none", getString(R.string.march_31)));
        events.add(new Attraction(getString(R.string.live_music_event), getString(R.string.firebug_event),
                "none", getString(R.string.march_31)));
        events.add(new Attraction(getString(R.string.chris_ramsey_event), getString(R.string.o2_event),
                "none", getString(R.string.april_2)));

        //Create an {@link AttractionAdapter}, whose data source is a list of Attractions.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), events, R.color.white);

        // Find the ListView object.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the ListView use the AttractionAdapter we created above.
        listView.setAdapter(adapter);

        return rootView;
    }
}