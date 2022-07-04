package GeeksForGeeks;

public class PeakElement {

    public static void main(String[] args) {
        //    int arr[] = {10, 7, 8, 20, 12};
        //  int arr[] = {80,70,90};
      //  int arr[] = {1, 4, 3, 6, 7, 5};
        int arr[] = {1,2,3,1};
       // int betterAns = findPeakElementInArray(arr);
        int betterAns = findPeakElementInArrayBetter(arr);
        System.out.println((betterAns != -1 ? "Peak element is" + betterAns : "No Peak Element"));
    }

    private static int findPeakElementInArrayBetter(int[] arr) {
        // we are using Binary Search Here
        // base case
        int n = arr.length;
        int startIndex = 0;
        int endIndex = n-1;

        if (n == 1) {
            return arr[0];
        }

        while (startIndex <= endIndex) {
            int mid = startIndex + (endIndex - startIndex) / 2;

            // check for mid element;

            if ((mid == 0 || (arr[mid - 1] <= arr[mid]) && (mid == n - 1 || (arr[mid] >= arr[mid + 1])))) {
                return arr[mid];
            }
            // if this was not mid element
            //go to left half
            else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                endIndex = mid - 1;
            } else {
                startIndex = mid + 1;
            }
        }

        return -1;
    }

    private static int findPeakElementInArray(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            return arr[0];
        }
        if (arr[0] >= arr[1]) {
            return arr[0];
        }

        if (arr[n - 1] >= arr[n - 2]) {
            return arr[n - 1];
        }
        // if element is somewhere between
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                return arr[i];
            }
        }

        return -1;
    }


}
