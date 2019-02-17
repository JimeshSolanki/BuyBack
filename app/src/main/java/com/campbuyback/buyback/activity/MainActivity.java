package com.campbuyback.buyback.activity;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.os.Bundle;
import android.view.MenuItem;

import com.campbuyback.buyback.R;
import com.campbuyback.buyback.common.BaseActivity;
import com.campbuyback.buyback.fragment.CartFragment;
import com.campbuyback.buyback.fragment.HomeFragment;
import com.campbuyback.buyback.fragment.PostFragment;
import com.campbuyback.buyback.fragment.ProfileFragment;
import com.campbuyback.buyback.fragment.WishlistFragment;

public class MainActivity extends BaseActivity {

    private Context mContext = MainActivity.this;
    private final static String TAG = MainActivity.class.getSimpleName();
    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void init() {

        actionBar = getSupportActionBar();

        BottomNavigationView navigationView = findViewById(R.id.main_navigation_view);
        navigationView.setOnNavigationItemSelectedListener(selectedListener);

        loadFragment(new HomeFragment());
        actionBar.setTitle(mContext.getResources().getString(R.string.menu_home));
    }

    @Override
    public void setLayout() {
    }

    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.main_frame_layout, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener selectedListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment fragment;

                    switch (menuItem.getItemId()) {
                        case R.id.menu_bottom_home:
                            actionBar.setTitle(mContext.getResources().getString(R.string.menu_home));
                            fragment = new HomeFragment();
                            loadFragment(fragment);
                            return true;

                        case R.id.menu_bottom_posts:
                            actionBar.setTitle(mContext.getResources().getString(R.string.menu_post));
                            fragment = new PostFragment();
                            loadFragment(fragment);
                            return true;

                        case R.id.menu_bottom_wishlist:
                            actionBar.setTitle(mContext.getResources().getString(R.string.menu_wishlist));
                            fragment = new WishlistFragment();
                            loadFragment(fragment);
                            return true;

                        case R.id.menu_bottom_cart:
                            actionBar.setTitle(mContext.getResources().getString(R.string.menu_shopping_cart));
                            fragment = new CartFragment();
                            loadFragment(fragment);
                            return true;

                        case R.id.menu_bottom_profile:
                            actionBar.setTitle(mContext.getResources().getString(R.string.menu_profile));
                            fragment = new ProfileFragment();
                            loadFragment(fragment);
                            return true;
                    }
                    return false;
                }
            };
}
