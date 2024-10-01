public class firstmissingpositive {
    
    // Function to find the first missing positive integer
    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        
        // Cyclic sort logic: place each number in its correct position
        while (i < nums.length) {
            int correct = nums[i] - 1;
            // Ensure the number is positive and within bounds, and not already in the correct position
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        
        // After sorting, find the first index where the number is incorrect
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return index + 1; // This is the first missing positive integer
            }
        }
        
        // If all numbers are in the correct positions, return the next positive integer
        return nums.length + 1;
    }

    // Helper function to swap two elements in the array
    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void main(String[] args) {
        // Test case: Array of integers
        int[] nums = {3, 4, -1, 1};
        int res = firstMissingPositive(nums);
        // Output the result
        System.out.println("The first missing positive integer is: " + res);
    }
}
