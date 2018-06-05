package com.lll.commonkotlin;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.lll.commonkotlin.base.BaseActivity;
import com.lll.commonkotlin.discovery.DiscoverFragment;
import com.lll.commonkotlin.homepage.HomePageFragment;
import com.lll.commonkotlin.user.UserPageFragment;
import com.lll.commonkotlin.user.activity.LoginActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    private static final String TAG = "MainActivity";

    @BindView(R.id.mainContainer)
    FrameLayout mainContainer;
    @BindView(R.id.radio_homepage)
    RadioButton radioHomepage;
    @BindView(R.id.radio_discover)
    RadioButton radioDiscover;
    @BindView(R.id.radio_user)
    RadioButton radioUser;
    @BindView(R.id.main_radioGroup)
    RadioGroup mainRadioGroup;

    private HomePageFragment homePageFragment;

    private UserPageFragment userPageFragment;

    private DiscoverFragment discoverFragment;

    private FragmentManager fragmentManager;


    @Override
    public int getPageLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        homePageFragment = new HomePageFragment();
        discoverFragment = new DiscoverFragment();
        userPageFragment = new UserPageFragment();
        fragmentManager = getSupportFragmentManager();
    }

    @Override
    protected void initData() {
        initFragment();
    }

    private void initFragment() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.mainContainer,homePageFragment)
                .hide(homePageFragment)
                .add(R.id.mainContainer,discoverFragment)
                .hide(discoverFragment)
                .add(R.id.mainContainer,userPageFragment)
                .hide(userPageFragment)
                .show(homePageFragment)
                .commit();
    }

    /**
     * 切换Fragment
     * @param fragment
     */
    private void replaceFragment(Fragment fragment){
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.hide(homePageFragment)
                .hide(discoverFragment)
                .hide(userPageFragment)
                .show(fragment)
                .commit();
    }

    @Override
    public void addListener() {
        super.addListener();
        mainRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radio_homepage:{
                        replaceFragment(homePageFragment);
                        break;
                    }
                    case R.id.radio_discover:{
                        replaceFragment(discoverFragment);
                        break;
                    }
                    case R.id.radio_user:{
                        replaceFragment(userPageFragment);
                        break;
                    }
                }
            }
        });
    }

}
