package com.campbuyback.buyback.customcontrols;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.campbuyback.buyback.R;
import com.campbuyback.buyback.util.AppConstant;
import com.google.android.material.card.MaterialCardView;

public class CustomToast {

    private static CustomToast customToast;
    private Context mContext;

    public CustomToast(Context mContext) {
        this.mContext = mContext;
    }

    public synchronized static CustomToast getInstance(Context mContext) {
        if (customToast == null) {
            customToast = new CustomToast(mContext);
        }
        return customToast;
    }

    public void showToast(int imageType, String message, boolean isLongDuration) {
        LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast, (ViewGroup) ((Activity) mContext).findViewById(R.id.ll_toast_layout));

        TextView msgTv = layout.findViewById(R.id.tv_toast_msg);
        msgTv.setText(message);

        MaterialCardView materialCardView = layout.findViewById(R.id.cv_toast);
        ImageView imageView = layout.findViewById(R.id.iv_toast_type);

        switch (imageType) {
            case AppConstant.TOAST_SUCCESS:
                materialCardView.setCardBackgroundColor(mContext.getResources().getColor(R.color.toastSuccess));
                imageView.setImageDrawable(mContext.getResources().getDrawable(R.drawable.ic_success));
                break;

            case AppConstant.TOAST_INFO:
                materialCardView.setCardBackgroundColor(mContext.getResources().getColor(R.color.toastInfo));
                imageView.setImageDrawable(mContext.getResources().getDrawable(R.drawable.ic_info));
                break;

            case AppConstant.TOAST_WARNING:
                materialCardView.setCardBackgroundColor(mContext.getResources().getColor(R.color.toastWarning));
                imageView.setImageDrawable(mContext.getResources().getDrawable(R.drawable.ic_warning));
                break;

            case AppConstant.TOAST_ERROR:
                materialCardView.setCardBackgroundColor(mContext.getResources().getColor(R.color.toastError));
                imageView.setImageDrawable(mContext.getResources().getDrawable(R.drawable.ic_error));
                break;
        }

        Toast toast = new Toast(mContext);
        //toast.setGravity(Gravity.FILL_HORIZONTAL | Gravity.BOTTOM, 0, 0);
        if (isLongDuration) {
            toast.setDuration(Toast.LENGTH_LONG);
        } else {
            toast.setDuration(Toast.LENGTH_SHORT);
        }
        toast.setView(layout);
        toast.show();
    }
}
