package com.campbuyback.buyback.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.campbuyback.buyback.R;
import com.campbuyback.buyback.common.BaseActivity;
import com.campbuyback.buyback.databinding.ActivityMainBinding;
import com.campbuyback.buyback.fragment.CartFragment;
import com.campbuyback.buyback.fragment.HomeFragment;
import com.campbuyback.buyback.fragment.PostFragment;
import com.campbuyback.buyback.fragment.ProfileFragment;
import com.campbuyback.buyback.fragment.WishlistFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends BaseActivity {

    private Context mContext = MainActivity.this;
    private final static String TAG = MainActivity.class.getSimpleName();
    private ActionBar actionBar;
    private FrameLayout frameLayout;
    private BottomNavigationView navigationView;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        actionBar = getSupportActionBar();

        loadFragment(new HomeFragment());
        binding.mainNavigationView.setSelectedItemId(R.id.menu_bottom_home);

        binding.mainNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment;

                switch (item.getItemId()) {
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
        });
    }

    @Override
    public void init() {

    }

    @Override
    public void setLayout() {
    }

    private void loadFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.main_frame_layout, fragment);
        //.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public void onBackPressed() {
        if (binding.mainNavigationView.getSelectedItemId() == R.id.menu_bottom_home) {
            super.onBackPressed();
        } else {
            binding.mainNavigationView.setSelectedItemId(R.id.menu_bottom_home);
        }
    }
}
