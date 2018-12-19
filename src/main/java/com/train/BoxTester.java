package com.train;

import java.util.Scanner;

public class BoxTester {

    public void boxInit() {
        System.out.println("*** This JAVA ***");
        System.out.println("Please enter object's length: ");
        float fLength = new Scanner(System.in).nextFloat();

        System.out.println("Please enter object's width: ");
        float fWidth = new Scanner(System.in).nextFloat();

        System.out.println("Please enter object's height: ");
        int iHeight = new Scanner(System.in).nextInt();

        if (new Box3().validate(fLength, fWidth, iHeight))
            System.out.println("Box3");
        else if (new Box5().validate(fLength, fWidth, iHeight))
            System.out.println("Box5");
        else
            System.out.println("The box does not match");
    }

}
