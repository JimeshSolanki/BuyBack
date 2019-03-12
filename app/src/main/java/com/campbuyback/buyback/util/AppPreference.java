package com.campbuyback.buyback.util;

import android.content.Context;
import android.content.SharedPreferences;

public class AppPreference {

    public AppPreference() {
    }

    public static void setPref(Context mContext, String key, String value) {
        SharedPreferences.Editor editor = getPreference(mContext).edit();
        editor.putString(key, value);
        editor.apply();
    }

    private static SharedPreferences getPreference(Context mContext) {
        return mContext.getSharedPreferences("BuyBackPreferences", Context.MODE_PRIVATE);
    }

    public static String getPref(Context mContext, String key) {
        return getPreference(mContext).getString(key, null);
    }
}
