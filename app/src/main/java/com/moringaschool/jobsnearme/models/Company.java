
package com.moringaschool.jobsnearme.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class Company {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("short_name")
    @Expose
    private String shortName;
    @SerializedName("name")
    @Expose
    private String name;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Company() {
    }

    /**
     * 
     * @param name
     * @param id
     * @param shortName
     */
    public Company(Integer id, String shortName, String name) {
        super();
        this.id = id;
        this.shortName = shortName;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
