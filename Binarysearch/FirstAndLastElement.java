import java.util.Arrays;

public class FirstAndLastElement {
    public static void main(String[] args) {
        // Example array and target value to find
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 10;

        // Output the range where the target appears, in the form of a two-element array
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    // Method to find the first and last positions of a target value in a sorted array
    static int[] searchRange(int[] nums, int target) {
        // Initialize result array. Default is [1, -1] (target not found).
        int[] ans = {1, -1};

        // Find the first occurrence of the target
        int start = search(nums, target, true);

        // Find the last occurrence of the target
        int end = search(nums, target, false);

        // Update the result array with start and end indices
        ans[0] = start;
        ans[1] = end;

        // Return the result array 
        return ans;
    }

    // Binary search method to find either the start or end position of the target
    static int search(int[] nums, int target, boolean findStartIndex) {
        // Initialize answer variable to store the index of the found target
        int ans = -1;

        // Set the search range with start and end pointers
        int start = 0;
        int end = nums.length - 1;

        // Perform binary search
        while (start <= end) {
            // Calculate the middle index to divide the search space
            int mid = start + (end - start) / 2;

            // If target is smaller than the middle element, search the left half
            if (target < nums[mid]) {
                end = mid - 1;
            }
            // If target is larger than the middle element, search the right half
            else if (target > nums[mid]) {
                start = mid + 1;
            }
            // If target is found, update the answer
            else {
                ans = mid;

                // If searching for the start index, move the end pointer to the left
                if (findStartIndex) {
                    end = mid - 1;
                }
                // If searching for the end index, move the start pointer to the right
                else {
                    start = mid + 1;
                }
            }
        }
        // Return the index where the target was found (or -1 if not found)
        return ans;
    }
}



    

