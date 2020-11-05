package com.moringaschool.jobsnearme.Network;

import com.moringaschool.jobsnearme.models.JobsListSearchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface JobsApi {

    @GET("public/jobs")
    Call<JobsListSearchResponse> getJobs(
//            @Query("jobs") String jobs,
            @Query("page") int page,
            @Query("api_key") String api_key
//            @Query("items_per_page") int items_per_page
    );
}
