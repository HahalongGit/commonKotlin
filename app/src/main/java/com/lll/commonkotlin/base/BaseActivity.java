package com.lll.commonkotlin.base;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import butterknife.ButterKnife;

/**
 * Created by longlong on 2018/6/5.
 *
 * @ClassName: BaseActivity
 * @Description: java 版本的 Activity 可以按照 java的语法写抽象和继承
 * @Date 2018/6/5
 */

public abstract class BaseActivity extends AppCompatActivity {

    private static final String TAG = "BaseActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getPageLayoutId());
        ButterKnife.bind(this);
        initView();
        initData();
        addListener();
    }


    /**
     * 启动Activity
     *
     * @param clazz
     */
    public void startActivity(Class clazz) {
        Intent intent = new Intent(this, clazz);
        startActivity(intent);
    }

    /**
     * 获取页面布局 id
     *
     * @return 布局 id
     */
    public abstract int getPageLayoutId();

    /**
     * 初始化 View
     */
    protected abstract void initView();

    /**
     * 初始化 数据
     */
    protected abstract void initData();

    /**
     * 添加View 的监听
     */
    public void addListener() {

    }

}
