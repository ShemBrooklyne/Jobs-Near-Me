
package com.moringaschool.jobsnearme.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class Result {

    @SerializedName("contents")
    @Expose
    private String contents;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("publication_date")
    @Expose
    private String publicationDate;
    @SerializedName("short_name")
    @Expose
    private String shortName;
    @SerializedName("model_type")
    @Expose
    private String modelType;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("locations")
    @Expose
    private List<Location> locations = null;
    @SerializedName("categories")
    @Expose
    private List<Category> categories = null;
    @SerializedName("levels")
    @Expose
    private List<Level> levels = null;
    @SerializedName("tags")
    @Expose
    private List<Tag> tags = null;
    @SerializedName("refs")
    @Expose
    private Refs refs;
    @SerializedName("company")
    @Expose
    private Company company;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Result() {
    }

    /**
     * 
     * @param modelType
     * @param type
     * @param tags
     * @param contents
     * @param refs
     * @param name
     * @param locations
     * @param company
     * @param id
     * @param categories
     * @param shortName
     * @param publicationDate
     * @param levels
     */
    public Result(String contents, String name, String type, String publicationDate, String shortName, String modelType, Integer id, List<Location> locations, List<Category> categories, List<Level> levels, List<Tag> tags, Refs refs, Company company) {
        super();
        this.contents = contents;
        this.name = name;
        this.type = type;
        this.publicationDate = publicationDate;
        this.shortName = shortName;
        this.modelType = modelType;
        this.id = id;
        this.locations = locations;
        this.categories = categories;
        this.levels = levels;
        this.tags = tags;
        this.refs = refs;
        this.company = company;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Level> getLevels() {
        return levels;
    }

    public void setLevels(List<Level> levels) {
        this.levels = levels;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Refs getRefs() {
        return refs;
    }

    public void setRefs(Refs refs) {
        this.refs = refs;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

}
