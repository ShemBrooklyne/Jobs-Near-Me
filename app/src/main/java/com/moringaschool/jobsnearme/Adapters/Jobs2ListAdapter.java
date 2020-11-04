package com.moringaschool.jobsnearme.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.moringaschool.jobsnearme.R;
import com.moringaschool.jobsnearme.models.Result;

import org.w3c.dom.Text;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Jobs2ListAdapter extends RecyclerView.Adapter<Jobs2ListAdapter.JobsViewHolder> {
    private List<Result> mResults;
    private Context mContext;

    public Jobs2ListAdapter(Context context, List<Result> results) {
        mContext = context;
        mResults = results;
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
    }

    @Override
    public int getItemCount() {
        return mResults.size();
    }

    public class JobsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.contentTextView) TextView mContentTextView;
        @BindView(R.id.nameTextView) TextView mNameTextView;

        private Context mContext;

        public JobsViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            mContext = itemView.getContext();
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

        }

        public void bindJobResults(Result result) {
            mContentTextView.setText(result.getShortName());
            mNameTextView.setText(result.getName());
        }
    }
}
