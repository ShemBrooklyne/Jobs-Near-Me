package com.moringaschool.jobsnearme.Network;

import com.moringaschool.jobsnearme.models.JobsListSearchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface JobsApi {

    @GET("public/jobs")
    Call<JobsListSearchResponse> getJobs(
//            @Query("jobs") String jobs,
            @Query("page") int page
    );
}
