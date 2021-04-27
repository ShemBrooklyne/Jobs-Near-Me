package com.moringaschool.jobsnearme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.moringaschool.jobsnearme.Adapters.Jobs2ListAdapter;
import com.moringaschool.jobsnearme.Network.JobsApi;
import com.moringaschool.jobsnearme.Network.JobsClient;
import com.moringaschool.jobsnearme.models.Category;
import com.moringaschool.jobsnearme.models.JobsListSearchResponse;
import com.moringaschool.jobsnearme.models.Result;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class JobsListActivity extends AppCompatActivity {
    public static final String TAG = JobsListActivity.class.getSimpleName();
//    private String[] jobs = new String[] {"Software Developer", "Fulltime Front-end", "Database Manager", "Api Creator", "Cloud storage", "Constructor",
//            "Technical Support", "Sales Person", "Marketing", "Brand Promoting", "Teacher", "Database Inspector", "Cloud Manager",
//            "Github pro", "Hapo tuu"};

//    @BindView(R.id.mJobsView) ListView JobsView;


    //RecyclerView Implementation

    @BindView(R.id.recyclerView) RecyclerView mRecyclerView;
    @BindView(R.id.errorTextView) TextView mErrorTextView;
    @BindView(R.id.progressBar) ProgressBar mProgressBar;

    private Jobs2ListAdapter mAdapter;

    public List<Result> results;

    public List<Category> categories;

    //Override calling get methods in main layout and class

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs);
        ButterKnife.bind(this);

        //Establishing connection of app and theMuse Api
        JobsApi jobsApi = JobsClient.getClient();
        Call<JobsListSearchResponse> call = jobsApi.getJobs(2, "fb59d07225fe46c6129cb850963369e2a9353f35c7803be61bb3d0b6e988c985");

        call.enqueue(new Callback<JobsListSearchResponse>() {
            @Override
            public void onResponse(Call<JobsListSearchResponse> call, Response<JobsListSearchResponse> response) {
                Log.d("On Response", "Got Response");
                if (response.isSuccessful()) {
                    hideProgressBar();
                    results = response.body().getResults();
                    mAdapter = new Jobs2ListAdapter(JobsListActivity.this, results, categories);
                    mRecyclerView.setAdapter(mAdapter);
                    RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(JobsListActivity.this);
                    mRecyclerView.setLayoutManager(layoutManager);
                    mRecyclerView.setHasFixedSize(true);
                    showResults();
                } else {
                    showUnsuccessfulMessage();
                }
            }

            @Override
            public void onFailure(Call<JobsListSearchResponse> call, Throwable t) {
                Log.e(TAG, "onFailure:", t);
                hideProgressBar();
                showFailureMessage();
            }
        });


    }

    private void showFailureMessage() {
        mErrorTextView.setText("Something went wrong. Please check your Internet connection and try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }

    private void showUnsuccessfulMessage() {
        mErrorTextView.setText("Something went wrong. Please try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }

    private void showResults() {
        mRecyclerView.setVisibility(View.VISIBLE);
    }

    private void hideProgressBar() {
        mProgressBar.setVisibility(View.GONE);
    }

}



