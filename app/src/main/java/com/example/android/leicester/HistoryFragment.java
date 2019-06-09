package com.example.android.leicester;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A {@link Fragment} subclass displaying historic sites in Leicester.
 */
public class HistoryFragment extends Fragment {

    public HistoryFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        //Create a list of historicPlaces
        final ArrayList<Attraction> historicPlaces = new ArrayList<>();
        historicPlaces.add(new Attraction(getString(R.string.guild_title), getString(R.string.guild_description),
                R.drawable.guildhall));
        historicPlaces.add(new Attraction(getString(R.string.abbey_title), getString(R.string.abbey_description),
                R.drawable.leicester_abbey));
        historicPlaces.add(new Attraction(getString(R.string.cathedral_title), getString(R.string.cathedral_description),
                R.drawable.leicester_cathedral));
        historicPlaces.add(new Attraction(getString(R.string.hall_title), getString(R.string.hall_description),
                R.drawable.town_hall));
        historicPlaces.add(new Attraction(getString(R.string.corn_exchange_title), getString(R.string.corn_exchange_description),
                R.drawable.corn_exchange));
        historicPlaces.add(new Attraction(getString(R.string.gateway_title), getString(R.string.gateway_description),
                R.drawable.magazine_gateway));

        //Create an {@link AttractionAdapter}, whose data source is a list of Attractions.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), historicPlaces, R.color.white);

        // Find the ListView object.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the ListView use the AttractionAdapter we created above.
        listView.setAdapter(adapter);

        return rootView;
    }
}