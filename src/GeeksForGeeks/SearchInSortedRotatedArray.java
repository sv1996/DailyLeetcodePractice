package GeeksForGeeks;

public class SearchInSortedRotatedArray {

    public static void main(String[] args) {
     //   int arr[] = {10, 20, 40, 60, 5, 8};
        // 4,5,6,7,0,1,

//        int arr[] ={4,5,6,7,0,1,2};
//        int element = 0;0
      int arr[] ={3,1};

       int element =1;
        int ans = searchInSortedRotatedArray(arr, element);
        if (ans == -1) {
            System.out.println("Element Not Found" + ans);
        } else {
            System.out.println("Element Found at" + ans);
        }

    }

    private static int searchInSortedRotatedArray(int[] nums, int target) {
        // We Are using binary search Here
        int low =0;
        int high = nums.length-1;

        while (low<=high)
        {
            // finding mid element
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            // search in left subArray
            if(nums[low] <= nums[mid]){
                // applying binary search in first half
                if(target>= nums[low]  && target <nums[mid]) {
                    high = mid-1;
                } else {
                    low = mid+1;
                }

            }
            // Search In Right Side Of Array
            else
            {

                if(target > nums[mid] && target <= nums[high]){
                    low = mid+1;
                } else {
                    high = mid-1;
                }
            }

        }


        return -1;
//        // Binary Search
//        int low = 0;
//        int high = arr.length - 1;
//        while (low < high) {
//            int mid = low + (high - low) / 2;
//            if (element == arr[mid]) {
//                return mid;
//            }
//            // search in first half Of Array
//            if (arr[low] < arr[mid]) {
//                if (element >= arr[low] && element < arr[mid]) {
//                    high = mid - 1;
//                } else {
//                    low = mid + 1;
//                }
//
//
//            }
//            // search In Another Side Of Array
//            else {
//
//                if (element > arr[mid] && element <= arr[high]) {
//                    low = mid + 1;
//                } else {
//                    high = mid - 1;
//                }
//
//
//            }
//        }
//            return -1;
        }
    }
