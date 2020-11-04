
package com.moringaschool.jobsnearme.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Level {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("short_name")
    @Expose
    private String shortName;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Level() {
    }

    /**
     * 
     * @param name
     * @param shortName
     */
    public Level(String name, String shortName) {
        super();
        this.name = name;
        this.shortName = shortName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

}
