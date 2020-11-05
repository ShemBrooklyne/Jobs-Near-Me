//package com.moringaschool.jobsnearme;
//
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import androidx.fragment.app.Fragment;
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//
//import com.moringaschool.jobsnearme.models.Result;
//
//import org.parceler.Parcels;
//
//import butterknife.BindView;
//import butterknife.ButterKnife;
//
//class ScrollingFragment extends Fragment {
//
//    @BindView(R.id.categoryView)
//    TextView mCategoryView;
//    //    @BindView(R.id.locationView) TextView mLocationView;
//    @BindView(R.id.natureTextView) TextView mNatureView;
//    @BindView(R.id.nameTextView) TextView mNameTextView;
//    @BindView(R.id.levelsView) TextView mLevelsView;
//
//    private Result mResults;
//
//
//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View v = inflater.inflate(R.layout.fragment_scrolling, container, false);
//        ButterKnife.bind(this, v);
//        mCategoryView.setText(mResults.getType());
//        mNameTextView.setText(mResults.getName());
//        mLevelsView.setText(mResults.getType());
//        mNatureView.setText(mResults.getPublicationDate());
//        return v;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        mResults = Parcels.unwrap(getArguments().getParcelable("results"));
//    }
//
//    public static ScrollingFragment newInstance(Result result) {
////        ScrollingFragment scrollingFragment = new scrollingFragment();
//        Bundle args = new Bundle();
//        args.putParcelable("results", Parcels.wrap(result));
//        scrollingFragment.setArguments(args);
//        return scrollingFragment;
//    }
//}
//
////    View v = inflater.inflate(R.layout.fragment_jobs_list_detail, container, false);
////        ButterKnife.bind(this, v);
////                mCategoryView.setText(mResults.getType());
////                mNameTextView.setText(mResults.getName());
////                mLevelsView.setText(mResults.getType());
////                mNatureView.setText(mResults.getPublicationDate());
////                return v;