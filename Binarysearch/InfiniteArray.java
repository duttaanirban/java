public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }   

    static int ans(int[] arr, int target) {
        //first find the range
        int start = 0;
        int end = 1;

        //condition for the target to lie in the range
        while (target > arr[end]) {
            int newStart = end + 1;
            //double the box value
            // end = prevend + sizeofbox *2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return binarysearch(arr, target, start, end);
    }
    
    static int binarysearch(int[] arr, int target, int start, int end) {

        // Loop until the start index is greater than the end index
        while (start <= end) {
            // Calculate the middle index of the current search range
            int mid = start + (end - start) / 2;

            // Check if the target is less than the middle element
            if (target < arr[mid]) {
                // Narrow the search to the left half
                end = mid - 1;
            }
            // Check if the target is greater than the middle element
            else if (target > arr[mid]) {
                // Narrow the search to the right half
                start = mid + 1;
            }
            
            // If the target is equal to the middle element, return the index
            
            else {
                return mid;
            }
        }
        return -1;  
    }
}
