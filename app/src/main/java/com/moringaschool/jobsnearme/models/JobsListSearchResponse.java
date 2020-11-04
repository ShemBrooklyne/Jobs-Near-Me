
package com.moringaschool.jobsnearme.models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;

@Parcel
public class JobsListSearchResponse {

    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("page_count")
    @Expose
    private Integer pageCount;
    @SerializedName("items_per_page")
    @Expose
    private Integer itemsPerPage;
    @SerializedName("took")
    @Expose
    private Integer took;
    @SerializedName("timed_out")
    @Expose
    private Boolean timedOut;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("results")
    @Expose
    private List<Result> results = null;
    @SerializedName("aggregations")
    @Expose
    private Aggregations aggregations;

    /**
     * No args constructor for use in serialization
     * 
     */
    public JobsListSearchResponse() {
    }

    /**
     * 
     * @param took
     * @param pageCount
     * @param total
     * @param timedOut
     * @param itemsPerPage
     * @param page
     * @param results
     * @param aggregations
     */
    public JobsListSearchResponse(Integer page, Integer pageCount, Integer itemsPerPage, Integer took, Boolean timedOut, Integer total, List<Result> results, Aggregations aggregations) {
        super();
        this.page = page;
        this.pageCount = pageCount;
        this.itemsPerPage = itemsPerPage;
        this.took = took;
        this.timedOut = timedOut;
        this.total = total;
        this.results = results;
        this.aggregations = aggregations;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getItemsPerPage() {
        return itemsPerPage;
    }

    public void setItemsPerPage(Integer itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }

    public Integer getTook() {
        return took;
    }

    public void setTook(Integer took) {
        this.took = took;
    }

    public Boolean getTimedOut() {
        return timedOut;
    }

    public void setTimedOut(Boolean timedOut) {
        this.timedOut = timedOut;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public Aggregations getAggregations() {
        return aggregations;
    }

    public void setAggregations(Aggregations aggregations) {
        this.aggregations = aggregations;
    }

}
