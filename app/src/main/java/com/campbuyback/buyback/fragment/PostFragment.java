package com.campbuyback.buyback.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.campbuyback.buyback.R;
import com.facebook.shimmer.ShimmerFrameLayout;

public class PostFragment extends Fragment {

    protected ShimmerFrameLayout mShimmerViewContainer;

    public PostFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_post, container, false);

        mShimmerViewContainer = view.findViewById(R.id.shimmer_view_container);

        mShimmerViewContainer.startShimmerAnimation();
        return view;
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
