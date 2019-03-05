package com.campbuyback.buyback.util;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;

import com.campbuyback.buyback.R;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import static android.content.ContentValues.TAG;

public class MainActivityViewModel extends ViewModel {

    private MutableLiveData<String> title = new MutableLiveData<>();

    private Context mContext;

    public MainActivityViewModel(Context mContext) {
        this.mContext = mContext;
    }

    private String getTitle() {
        return this.title.getValue();
    }

    public boolean onNavigationClick(MenuItem item) {

        Fragment fragment;

        switch (item.getItemId()) {

            case R.id.menu_bottom_home:
                setTitle(mContext.getResources().getString(R.string.menu_home));
                Log.d(TAG, "onNavigationClick: Home Pressed.");
                return true;

            case R.id.menu_bottom_posts:
                setTitle(mContext.getResources().getString(R.string.menu_post));
                Log.d(TAG, "onNavigationClick: Posts Pressed.");
                return true;

            case R.id.menu_bottom_wishlist:
                setTitle(mContext.getResources().getString(R.string.menu_wishlist));
                Log.d(TAG, "onNavigationClick: Wishlist Pressed.");
                return true;

            case R.id.menu_bottom_cart:
                setTitle(mContext.getResources().getString(R.string.menu_shopping_cart));
                Log.d(TAG, "onNavigationClick: Cart Pressed.");
                return true;

            case R.id.menu_bottom_profile:
                setTitle(mContext.getResources().getString(R.string.menu_profile));
                Log.d(TAG, "onNavigationClick: Profile Pressed.");
                return true;
        }
        return false;
    }

    private void setTitle(String title) {
        this.title.setValue(title);
    }
}
