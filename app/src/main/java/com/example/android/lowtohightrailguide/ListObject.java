package com.example.android.lowtohightrailguide;

public class ListObject {

    private String mTitle;

    private String mDescription;

    private int mImageResourceId;

    public ListObject(String title, String description, int imageResourceid) {
        mTitle = title;
        mDescription = description;
        mImageResourceId = imageResourceid;
    }

    public ListObject(String title, String description) {
        mTitle = title;
        mDescription = description;
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

    @Override
    public String toString() {
        return "ListObject{ "
                + "mTitle=" + mTitle
                + "\nmDescription=" + mDescription
                + "\nmImageResourceId=" + mImageResourceId
                + "}";
    }
}
