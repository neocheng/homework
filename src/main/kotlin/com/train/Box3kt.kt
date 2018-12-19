package com.train

//Box3: 長23，寬14，高13 (cm)
class Box3kt {

    val length = 23f
    val width = 14f
    val height = 13

    fun validate(flength: Float, fwidth: Float, iheight: Int): Boolean =
        (flength <= length && fwidth <= width && iheight <= height)


}