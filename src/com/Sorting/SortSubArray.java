package com.Sorting;

import java.util.Arrays;

public class SortSubArray {
    public static void main(String[] args) {
        int arr[] = {1, 8, 4, 2, 1,-1,11,56,78};

        Arrays.sort(arr,2,arr.length);
        System.out.println(Arrays.toString(arr));
//        for (int i =0;i<arr.length;i++)
//        {
//            System.out.println(arr[i]);
//        }

    }
}
