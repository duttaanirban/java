import java .util.Scanner;


public class BinarySearch {
    public static void main(String[] args) {
        // Sample sorted array
        int[] arr = {-10, -4, 4, 6, 8, 9, 10, 12, 14, 15, 17, 19};
        
        // The target value we want to find in the array\
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target element:");
        int target = sc.nextInt();

        // Call the binary search method and store the result in 'ans'
        int ans = binarysearch(arr, target);

        // Output the result
        System.out.println("index of " + target + " at " + ans);
        sc.close();
    }

    // Method to perform binary search on a sorted array
    static int binarysearch(int[] arr, int target) {
        // Initialize the start and end indices of the search range
        int start = 0;
        int end = arr.length - 1;

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
        
        // If the target is not found, return -1
        return -1;  
    }
}
