package com.Searching;

public class SearchInSortedRotatedArray {
    public static void main(String[] args) {
        int arr[] = {100, 200, 500, 1000, 2000, 10, 20};
        int element = 0;
        int pos = searchInSortedRotatedArrayNaiveApproach(arr, element);
        System.out.println("Position is->" + pos);
    }

    private static int searchInSortedRotatedArrayNaiveApproach(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element)
                return i;
        }
        return  -1;
    }
}
