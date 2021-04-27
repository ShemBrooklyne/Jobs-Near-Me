package com.moringaschool.jobsnearme.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.moringaschool.jobsnearme.JobsListDetailFragment;
import com.moringaschool.jobsnearme.models.Result;

import java.util.List;

public class JobsPagerAdapter extends FragmentPagerAdapter {

    private List<Result> mResults;

    public JobsPagerAdapter (FragmentManager fm, int behaviour, List<Result> results) {
        super(fm, behaviour);
        mResults = results;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return JobsListDetailFragment.newInstance(mResults.get(position));
//        return null;
    }

    @Override
    public int getCount() {
        return mResults.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mResults.get(position).getType();
    }
}
