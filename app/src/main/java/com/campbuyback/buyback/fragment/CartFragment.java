package com.campbuyback.buyback.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.DrawableImageViewTarget;
import com.campbuyback.buyback.R;

import java.util.Objects;

public class CartFragment extends Fragment {

    protected ImageView imageView;

    public CartFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cart, container, false);

        imageView = view.findViewById(R.id.iv_fargment_cart_empty_cart);

        DrawableImageViewTarget target = new DrawableImageViewTarget(imageView);

        Glide.with(Objects.requireNonNull(getActivity()).getBaseContext()).load(R.drawable.empty_cart).into(target);

        return view;
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
