package com.lll.commonkotlin.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

/**
 * Created by longlong on 2018/6/5.
 *
 * @ClassName: BaseFragment
 * @Description:
 * @Date 2018/6/5
 */

public abstract class BaseFragment extends Fragment {

    private View convertView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (convertView == null) {
            convertView = inflater.inflate(getFragmentLayoutId(), container, false);
            ButterKnife.bind(this, convertView);
            initView();
        }
        return convertView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initData();
        addListener();
    }

    /**
     * 获取Fragment 布局 id
     *
     * @return
     */
    public abstract int getFragmentLayoutId();

    /**
     * 初始化View
     */
    protected abstract void initView();

    /**
     * 初始化Data
     */
    protected abstract void initData();

    /**
     * 添加监听 选择实现
     */
    public void addListener(){

    }


}
