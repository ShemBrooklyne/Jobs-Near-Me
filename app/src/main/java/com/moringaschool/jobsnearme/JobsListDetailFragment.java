package com.moringaschool.jobsnearme;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.moringaschool.jobsnearme.models.Result;

import org.parceler.Parcels;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link JobsListDetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class JobsListDetailFragment extends Fragment implements View.OnClickListener {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    @BindView(R.id.categoryView) TextView mCategoryView;
//    @BindView(R.id.locationView) TextView mLocationView;
    @BindView(R.id.natureTextView) TextView mNatureView;
    @BindView(R.id.nameTextView) TextView mNameTextView;
    @BindView(R.id.levelsView) TextView mLevelsView;

    private Result mResults;

    public JobsListDetailFragment() {
        // Required empty public constructor
    }



    public static JobsListDetailFragment newInstance(Result result) {
        JobsListDetailFragment jobsListDetailFragment = new JobsListDetailFragment();
        Bundle args = new Bundle();
        args.putParcelable("results", Parcels.wrap(result));
        jobsListDetailFragment.setArguments(args);
        return jobsListDetailFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mResults = Parcels.unwrap(getArguments().getParcelable("results"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_jobs_list_detail, container, false);
        ButterKnife.bind(this, v);
        mCategoryView.setText(mResults.getType());
        mNameTextView.setText(mResults.getName());
        mLevelsView.setText(mResults.getType());
        mNatureView.setText(mResults.getPublicationDate());
        return v;
    }

    @Override
    public void onClick(View v) {

    }
}