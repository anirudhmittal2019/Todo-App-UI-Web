package com.example.android.quakereport;

import java.text.SimpleDateFormat;

/**
 * Created by sanjay on 2/4/2019.
 */

public class Earthquake {

    //Magnitude of Earthquake
    private double mMag;

    //Location of Earthquake
    private String mLocation;

    //Date of occurence of Earthquake
    private String mDate;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    /** Website URL of the earthquake */
    private String mURL;


    public Earthquake(double magnitude, String location, long timeInMilliseconds, String URL) {
        mMag = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mURL = URL;
    }

    public double getmMag() {
        return mMag;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmDate() {
        return mDate;
    }

    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getmURL() {
        return mURL;
    }

}
