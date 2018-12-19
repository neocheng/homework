package com.train;

//Box3: 長23，寬14，高13 (cm)
public class Box3 {

    private float length = 23f;
    private float width = 14f;
    private int height = 13;

    public boolean validate(float length, float width, int height) {

        if (length <= this.length && width <= this.width && height <= this.height)
            return true;
        else

            return false;
    }
}
