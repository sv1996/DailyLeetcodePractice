package com.Searching;

public class SearchInInfiniteSizeArray {
    public static void main(String[] args) {
        // given an Array of Infinite Sized Aray
        //   int arr[] = {1,2,200,300.......}
        int arr[] = {1, 15, 200, 300, 500};
        int x = 15;
        int n = arr.length;
      //  int ans = searchInINfiniteSizeArray(arr, n, x);
        int betterAns = searchInINfiniteSizeArrayBetter(arr, n, x);
   //     System.out.println(ans);
        if(betterAns ==-1){
            System.out.println("Key Doesn't exxts");
        }
        else {
            System.out.println("Key Exists with position" + betterAns);
        }

    }

    private static int searchInINfiniteSizeArrayBetter(int[] arr, int n, int key) {
//        int low = 0;
//        int high = 1;
//        int val = arr[0];
//        while (val < key) {
//            low = high;
//
//            if (2 * high < arr.length - 1) {
//                high = 2 * high;
//
//            } else {
//                high = arr.length - 1;
//            }
//
//            val = arr[high];
//        }
        int l = 0, h = 1;
        int val = arr[0];

        // Find h to do binary search
        while (val < key)
        {
            l = h;     // store previous high
            //check that 2*h doesn't exceeds array
            //length to prevent ArrayOutOfBoundException
            if(2*h < arr.length-1)
                h = 2*h;
            else
                h = arr.length-1;

            val = arr[h]; // update new val
            System.out.println("logger");
        }
        return binarySearch(arr, l, h, key);
    }

    private static int binarySearch(int[] arr, int low, int high, int key) {

        int mid = low + (high - low) / 2;

        if(low <=high)
        {
            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] > key) {
                return binarySearch(arr, low, mid - 1, key);

            }

            return binarySearch(arr, mid + 1, high, key);

        }
        return -1;
    }

    private static int searchInINfiniteSizeArray(int[] arr, int n, int x) {
        int i = 0;
        while (true) {

            if (arr[i] == x)
                return i;
            if (arr[i] > x)
                return -1;

            i++;

        }

    }
}
