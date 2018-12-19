package com.train

//Box5: 長39.5，寬27.5，高23 (cm)
class Box5kt {

    val length = 39.5f
    val width = 27.5f
    val height = 23

    fun validate(flength: Float, fwidth: Float, iheight: Int): Boolean =
        (flength <= length && fwidth <= width && iheight <= height)

}