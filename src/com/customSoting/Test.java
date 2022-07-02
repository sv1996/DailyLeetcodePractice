package com.customSoting;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Point p[] = {new Point(10,20), new Point(3,12) , new Point(5,7)};

// to Sort in  descending order
        Arrays.sort(p);

        // to sort in Reverse Order
        //   Arrays.sort(p,Collections.reverseOrder());



        for (int i = 0; i <p.length ; i++) {
            System.out.println(p[i].x +" "+p[i].y);

        }

//        instanceof
    }
}
