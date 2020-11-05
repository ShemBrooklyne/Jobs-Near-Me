package com.moringaschool.jobsnearme.Adapters;

import android.content.Context;
import android.widget.ArrayAdapter;

public class JobsListArrayAdapter extends ArrayAdapter {
    private Context mContext;
    private String[] mJobs;

    public JobsListArrayAdapter(Context mContext, int resource, String[] mJobs) {
        super(mContext, resource);
        this.mContext = mContext;
        this.mJobs = mJobs;
    }

    @Override
    public Object getItem(int position) {
        String jobs = mJobs[position];
        return String.format("Hope utashoo: %s", jobs);
    }

    @Override
    public int getCount() {
        return mJobs.length;
    }
}
