package com.example.android.leicester;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */

public class CategoryAdapter extends FragmentPagerAdapter {
    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param context is the context of the app
     * @param fm      is the fragment manager that will keep each fragment's state in the adapter
     *                across swipes.
     */
    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new HistoryFragment();
        else if (position == 1)
            return new BarFragment();
        else if (position == 2)
            return new ParkFragment();
        else
            return new EventFragment();
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    /**
     * Return the title string that should be displayed for the specified page.
     */
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
            return mContext.getString(R.string.history_cat);
        else if (position == 1)
            return mContext.getString(R.string.restaurant_cat);
        else if (position == 2)
            return mContext.getString(R.string.park_cat);
        else
            return mContext.getString(R.string.event_cat);
    }
}
