package com.example.android.leicester;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link AttractionAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Attraction} objects.
 */
public class AttractionAdapter extends ArrayAdapter<Attraction> {
    /* Resource ID for the background colour for this list of attractions */
    private int mColourResourceId;

    /**
     * Create a new {@link AttractionAdapter} object.
     *
     * @param context      is the current context (i.e. Activity) that the adapter is being created in.
     * @param places       is the list of {@link Attraction} to be displayed.
     * @param layoutColour is the resource ID for the background colour for this list of attractions
     */
    public AttractionAdapter(Activity context, ArrayList<Attraction> places, int layoutColour) {
        super(context, 0, places);
        mColourResourceId = layoutColour;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        // Check if an existing view is being reused
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false
            );
        }

        // Get the Attraction object located at this position in the list
        Attraction currentAttraction = getItem(position);

        // Find the ImageView in the list_item.xml layout with the ID attraction_image
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.attraction_image);

        // Check if an image is provided for this attraction or not
        if (currentAttraction.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            iconView.setImageResource(currentAttraction.getImageResourceId());
            iconView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView
            iconView.setVisibility(View.GONE);
        }

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date_textview);

        if (currentAttraction.hasDate()) {
            dateTextView.setText(currentAttraction.getDate());
            dateTextView.setVisibility(View.VISIBLE);
        } else {
            dateTextView.setVisibility(View.GONE);
        }

        // Find the TextView in the list_item.xml layout with the ID title
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title);

        // Get the title from the currentAttraction object and set this text on the default TextView
        try {
            titleTextView.setText(currentAttraction.getTitle());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description);

        try {
            descriptionTextView.setText(currentAttraction.getDescription());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }

        TextView openingHoursTextView = (TextView) listItemView.findViewById(R.id.opening_hours_textview);

        if (currentAttraction.hasOpeningHours()) {
            openingHoursTextView.setText(currentAttraction.getOpeningHours());
            openingHoursTextView.setVisibility(View.VISIBLE);
        } else {
            openingHoursTextView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View container = listItemView.findViewById(R.id.my_list);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColourResourceId);
        // Set the background color of the text container View
        container.setBackgroundColor(color);

        // Return the whole list item layout so that it can be shown in the ListView
        return listItemView;
    }
}
