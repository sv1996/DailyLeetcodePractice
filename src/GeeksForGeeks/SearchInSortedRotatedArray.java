package GeeksForGeeks;

public class SearchInSortedRotatedArray {

    public static void main(String[] args) {
        int arr[] = {10, 20, 40, 60, 5, 8};
        int element = 5;
        int ans = searchInSortedRotatedArray(arr, element);
        if (ans == -1) {
            System.out.println("Element Not Found" + ans);
        } else {
            System.out.println("Element Found at" + ans);
        }

    }

    private static int searchInSortedRotatedArray(int[] arr, int element) {
        // Binary Search
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (element == arr[mid]) {
                return mid;
            }
            // search in first half Of Array
            if (arr[low] < arr[mid]) {
                if (element >= arr[low] && element < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }


            }
            // search In Another Side Of Array
            else {

                if (element > arr[mid] && element <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }


            }
        }
            return -1;
        }
    }
