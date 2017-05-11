package com.example.android.lowtohightrailguide;

public class ListObject {

    private static final double NO_MILE_PROVIDED = -1.1;
    private double mMilePoint = NO_MILE_PROVIDED;
    private String mTitle;
    private String mDescription;
    private int mImageResourceId;

    public ListObject(String title, double milePoint, String description, int imageResourceid) {
        mTitle = title;
        mMilePoint = milePoint;
        mDescription = description;
        mImageResourceId = imageResourceid;
    }

    public ListObject(String title, double milePoint, String description) {
        mTitle = title;
        mMilePoint = milePoint;
        mDescription = description;
    }

    public ListObject(String title) {
        mTitle = title;
    }

    public String getmDescription() {
        return mDescription;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public boolean hasMile(){
        return mMilePoint != NO_MILE_PROVIDED;
    }

    public double getmMilePoint() {
        return mMilePoint;
    }
    @Override
    public String toString() {
        return "ListObject{ "
                + "mTitle=" + mTitle
                + "\nmDescription=" + mDescription
                + "\nmImageResourceId=" + mImageResourceId
                + "}";
    }


}
