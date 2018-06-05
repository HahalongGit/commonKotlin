package com.lll.commonkotlin.user;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lll.commonkotlin.R;
import com.lll.commonkotlin.base.BaseFragment;

/**
 * Created by longlong on 2018/6/5.
 *
 * @ClassName: UserPageFragment
 * @Description: 创建的Java 的 Fragment 用户中心
 * @Date 2018/6/5
 */

public class UserPageFragment extends BaseFragment {


    @Override
    public int getFragmentLayoutId() {
        return R.layout.fragment_user_page;
    }

    @Override
    protected void initView() {
        // TODO: 2018/6/5 java 中可以写一个 TODO Kotlin 中不能写
    }

    @Override
    protected void initData() {

    }


}
