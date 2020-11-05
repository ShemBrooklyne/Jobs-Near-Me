package com.moringaschool.jobsnearme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.moringaschool.jobsnearme.Adapters.JobsPagerAdapter;
import com.moringaschool.jobsnearme.models.Result;

import org.parceler.Parcels;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class JobsListDetailActivity extends AppCompatActivity {

    @BindView(R.id.viewPager) ViewPager mViewPager;

    private JobsPagerAdapter adapterViewPager;
    List<Result> mResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jobs_list_detail);

        ButterKnife.bind(this);

        mResults = Parcels.unwrap(getIntent().getParcelableExtra("results"));
        int startingPosition = getIntent().getIntExtra("position", 0);

        adapterViewPager = new JobsPagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT, mResults);
        mViewPager.setAdapter(adapterViewPager);
        mViewPager.setCurrentItem(startingPosition);
    }
}