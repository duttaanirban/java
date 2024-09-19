public class RotatedBs {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 7;
        int ans = search(arr, target);
        System.out.println("Value is :" +arr[ans] + " with the index :" +ans);
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        
        // If pivot is -1, the array is not rotated, do normal binary search
        if (pivot == -1) {
            return binarysearch(nums, target, 0, nums.length - 1);
        }

        // If the target is the pivot element
        if (nums[pivot] == target) {
            return pivot;
        }

        // If the target is greater than or equal to the first element, search in the left half
        if (target >= nums[0]) {
            return binarysearch(nums, target, 0, pivot - 1);
        }

        // Else, search in the right half
        return binarysearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid is the pivot
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            // Check if mid-1 is the pivot
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // Adjust the search range
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // No pivot found, array is not rotated
        return -1;
    }

    static int binarysearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; // Target found
            }
        }
        return -1; // Target not found
    }
}

