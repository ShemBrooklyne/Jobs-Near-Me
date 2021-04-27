package com.moringaschool.jobsnearme.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.jobsnearme.JobsListDetailActivity;
import com.moringaschool.jobsnearme.R;
import com.moringaschool.jobsnearme.models.Category;
import com.moringaschool.jobsnearme.models.Location;
import com.moringaschool.jobsnearme.models.Result;

import org.parceler.Parcels;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Jobs2ListAdapter extends RecyclerView.Adapter<Jobs2ListAdapter.JobsViewHolder> {
    private List<Result> mResults;
    private List<Category> mCategory;
    private List<Location> mLocations;
    private Context mContext;

    public Jobs2ListAdapter(Context context, List<Result> results, List<Category> categories) {
        mContext = context;
        mResults = results;
        mCategory = categories;
    }

    @NonNull
    @Override
    public Jobs2ListAdapter.JobsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_jobs_list, parent, false);
        JobsViewHolder viewHolder = new JobsViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Jobs2ListAdapter.JobsViewHolder holder, int position) {
        holder.bindJobResults(mResults.get(position));
//        holder.bindJobResults(mCategory.get(position));
    }

    @Override
    public int getItemCount() {
        return mResults.size();
    }

    public class JobsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
//        @BindView(R.id.natureTextView) TextView mNatureTextView;
        @BindView(R.id.nameTextView) TextView mNameTextView;
//        @BindView(R.id.categoryView) TextView mCategoryTextView;
//        @BindView(R.id.levelsView) TextView mLevelsTextView;
        @BindView(R.id.linkView) TextView mLinkTextView;
        @BindView(R.id.companyView) TextView mCompanyTextView;
        @BindView(R.id.locationView) TextView mLocationTextView;

        private Context mContext;

        public JobsViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int itemPosition = getLayoutPosition();
            Intent intent = new Intent(mContext, JobsListDetailActivity.class);
            intent.putExtra("position", itemPosition);
            intent.putExtra("results", Parcels.wrap(mResults));
            mContext.startActivity(intent);
        }

        public void bindJobResults(Result result) {
                mNameTextView.setText(result.getName());
//                mNatureTextView.setText(result.getPublicationDate());
//                mLevelsTextView.setText((CharSequence) result.getCategories());
//                mCategoryTextView.setText((CharSequence) result.getCategories());
                mLinkTextView.setText(result.getRefs().getLandingPage());
                mCompanyTextView.setText(result.getCompany().getName());
                mLocationTextView.setText(result.getPublicationDate());
            }
    }


}
