package com.lll.commonkotlin.bean

/**
 * Created by longlong on 2018/6/5.
 *
 * @ClassName: KotlinBean
 * @Description:
 * @Date 2018/6/5
 */

class KotlinBean {

    var name: String? = null

    var age: Int = 0

    var isChecked: Boolean = false

    var kotlinId: Long = 0

    private var aByte: Byte = 0

    var gender: Short = 0

    var quality: Float = 0.toFloat()

    var money: Double = 0.toDouble()

    fun getaByte(): Byte {
        return aByte
    }

    fun setaByte(aByte: Byte) {
        this.aByte = aByte
    }
}
