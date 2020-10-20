package com.example.android.quakereport;


import android.content.Context;
import android.content.AsyncTaskLoader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sanjay on 2/15/2019.
 */

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {

    private static String mUrl = null;

    public EarthquakeLoader(Context context,String url) {
        super(context);
        mUrl = url;
    }

    @Override
    public List<Earthquake> loadInBackground() {
        // Don't perform the request if there are no URLs, or the first URL is null.
        if (mUrl.length() < 0 || mUrl == null) {
            return null;
        }

        ArrayList<Earthquake> result = QueryUtils.fetchEarthquakes(mUrl);
        return result;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

}
