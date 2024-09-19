public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(countRotations(arr));
    }

    static int countRotations(int[] arr) {
        int pivot = findPivotUnique(arr);
        return pivot + 1;
    }
    
    static int findPivotDuplicate(int[] arr) {
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

            //if elements at middle, start, end are equal then just skip the duplicates
            if ( arr[start] == arr[mid] && arr[mid] == arr[end]) {
                //skip the duplicates
                //check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                //check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
             else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[end] < arr[mid])) {
                start = mid + 1;
             }
             else {
                end = mid - 1;
             }
        }
        // No pivot found, array is not rotated
        return -1;
    }

    static int findPivotUnique(int[] arr) {
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
}
