
package com.moringaschool.jobsnearme.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class Refs {

    @SerializedName("landing_page")
    @Expose
    private String landingPage;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Refs() {
    }

    /**
     * 
     * @param landingPage
     */
    public Refs(String landingPage) {
        super();
        this.landingPage = landingPage;
    }

    public String getLandingPage() {
        return landingPage;
    }

    public void setLandingPage(String landingPage) {
        this.landingPage = landingPage;
    }

}
