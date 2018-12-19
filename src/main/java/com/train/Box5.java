package com.train;

//Box5: 長39.5，寬27.5，高23 (cm)
public class Box5 {

    private float length = 39.5f;
    private float width = 27.5f;
    private int height = 23;

    public boolean validate(float length, float width, int height) {

        if (length <= this.length && width <= this.width && height <= this.height)
            return true;
        else

            return false;
    }

}
