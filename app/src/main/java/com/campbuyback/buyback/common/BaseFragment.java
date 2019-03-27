package com.campbuyback.buyback.common;

import android.content.Context;

import com.campbuyback.buyback.customcontrols.CustomToast;

import androidx.fragment.app.Fragment;

public abstract class BaseFragment extends Fragment {

    private final Context mContext = getActivity();

    public void setToast(int imageId, String toastMessage, boolean isLong) {
        CustomToast customToast = new CustomToast(mContext);
        customToast.showToast(imageId, toastMessage, isLong);
    }
}
