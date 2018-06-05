package com.lll.commonkotlin.homepage

import android.os.Bundle
import android.support.v4.app.Fragment
import com.lll.commonkotlin.R
import com.lll.commonkotlin.base.BaseFragment

/**
 * A simple [Fragment] subclass.
 * 自动创建的 Konlin 格式的 Fragment
 */
class HomePageFragment : BaseFragment() {

    private var mParam1: String? = null
    private var mParam2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun getFragmentLayoutId(): Int {
        return R.layout.fragment_home_page
    }

    override fun initView() {
        // Kotlin 中不能添加空的 to do 会报错
    }

    override fun initData() {

    }

}
