package com.example.android.leicester;

/**
 * {@link Attraction} represents a given attraction in Leicester.
 * Attraction contains a title and a description, may or may not contain an image, may or may not
 * contain opening hours information and may or may not contain date information.
 */

public class Attraction {
    /* Constant value that represents no image has been provided for the given attraction */
    private static final int NO_IMAGE_PROVIDED = -1;
    /* Constant value that represents no date have been provided for the given attraction */
    private static final String NO_DATE_PROVIDED = "none";
    /* Constant value that represents no opening hours have been provided for the given attraction */
    private static final String NO_HOURS_PROVIDED = "none";
    /* Image resource ID for the attraction */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    /* Title of the attraction */
    private String mTitle;
    /* Description of the attraction */
    private String mDescription;
    /* Date of the attraction */
    private String mDate = NO_DATE_PROVIDED;
    /* Opening hours of the given attraction */
    private String mOpeningHours = NO_HOURS_PROVIDED;

    /**
     * Create a new Attraction object.
     *
     * @param title        is the title of the attraction
     * @param description  is the description of the attraction
     * @param openingHours are the opening hours of the attraction
     */
    public Attraction(String title, String description, String openingHours, String date) {
        mTitle = title;
        mDescription = description;
        mOpeningHours = openingHours;
        mDate = date;
    }

    /**
     * Create a new Attraction object.
     *
     * @param title           is the title of the attraction
     * @param description     is the description of the attraction
     * @param imageResourceId is the drawable resource ID for the image associated with the attraction
     */
    public Attraction(String title, String description, int imageResourceId) {
        mTitle = title;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    /**
     * Returns the title of the attraction.
     *
     * @return title of the attraction
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the description of the attraction.
     *
     * @return description of the attraction
     */
    public String getDescription() {
        return mDescription;
    }

    /**
     * Sets the mDescription to a given value.
     *
     * @param description description of the attraction
     */
    public void setDescription(String description) {
        mDescription = description;
    }

    /**
     * Returns the opening hours of the attraction.
     *
     * @return opening hours of the attraction
     */
    public String getOpeningHours() {
        return mOpeningHours;
    }

    /**
     * Sets the mOpeningHours to a given value.
     *
     * @param openingHours opening hours of the attraction
     */
    public void setOpeningHours(String openingHours) {
        mOpeningHours = openingHours;
    }

    /**
     * Returns the image resource id associated with the attraction.
     *
     * @return image resource id associated with the attraction
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Sets the mImageResourceId to a given value.
     *
     * @param imageResourceId resource id of the image
     */
    public void setImageResourceId(int imageResourceId) {
        mImageResourceId = imageResourceId;
    }

    /**
     * Returns the date associated with the attraction.
     *
     * @return date associated with the attraction
     */
    public String getDate() {
        return mDate;
    }

    /**
     * Sets the mDate to a given value.
     *
     * @param date date of the attraction
     */
    public void setDate(String date) {
        mDate = date;
    }

    /**
     * Sets the mTitle to a given value.
     *
     * @param title name of the attraction
     */
    public void setPlacetitle(String title) {
        mTitle = title;
    }

    /**
     * Checks whether or not there are opening hours provided for this attraction.
     *
     * @return true if the opening hours are provided, false otherwise.
     */
    public boolean hasOpeningHours() {
        return mOpeningHours != NO_HOURS_PROVIDED;
    }

    /**
     * Checks whether or not there is an image provided for this attraction.
     *
     * @return true if the image is provided, false otherwise.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Checks whether or not there is date provided for this attraction.
     *
     * @return true if the date is provided, false otherwise.
     */
    public boolean hasDate() {
        return mDate != NO_DATE_PROVIDED;
    }

    /**
     * Returns the string representation of the {@link Attraction} object.
     */
    @Override
    public String toString() {
        return "Attraction{" +
                "mImageResourceId=" + mImageResourceId + '\'' +
                ", mTitle='" + mTitle + '\'' +
                ", mDescription='" + mDescription + '\'' +
                ", mDate=" + mDate + '\'' +
                ", mOpeningHours=" + mOpeningHours +
                '}';
    }
}
