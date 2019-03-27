package com.campbuyback.buyback.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.campbuyback.buyback.R;
import com.campbuyback.buyback.common.BaseFragment;
import com.campbuyback.buyback.model.BaseResponse;
import com.campbuyback.buyback.model.ProductModel;
import com.campbuyback.buyback.network.ApiClient;
import com.campbuyback.buyback.network.ApiService;
import com.campbuyback.buyback.util.AppConstant;
import com.facebook.shimmer.ShimmerFrameLayout;

import java.util.ArrayList;
import java.util.Objects;

import androidx.annotation.NonNull;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

import static androidx.constraintlayout.widget.Constraints.TAG;

public class PostFragment extends BaseFragment {

    ArrayList<ProductModel> listOfProducts;

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

        ShimmerFrameLayout mShimmerViewContainer = view.findViewById(R.id.shimmer_view_container);

        mShimmerViewContainer.startShimmerAnimation();

        getAllPosts();

        return view;
    }

    @SuppressLint("CheckResult")
    private synchronized void getAllPosts() {
        ApiService apiService = ApiClient.getClient(Objects.requireNonNull(getActivity()).getApplicationContext()).
                create(ApiService.class);

        apiService.getAllProducts()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(new DisposableSingleObserver<BaseResponse>() {

                    @Override
                    public void onSuccess(BaseResponse baseResponse) {

                        if (baseResponse.getStatus() == 1) {

                            setToast(AppConstant.TOAST_SUCCESS, baseResponse.getMessage(), true);

                        } else {

                            setToast(AppConstant.TOAST_INFO, baseResponse.getMessage(), true);
                        }

                    }

                    @Override
                    public void onError(Throwable t) {
                        Log.d(TAG, "onError: " + t.getLocalizedMessage());
                    }
                });
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
