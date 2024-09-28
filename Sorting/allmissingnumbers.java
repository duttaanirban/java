import java.util.ArrayList;
import java.util.List;

public class allmissingnumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            // Make sure to only swap when nums[i] is within bounds and not already in the correct position
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // Find missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            // If the current number is not at its correct index, it means the number (index + 1) is missing
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }
        return ans;
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    // Main function to run the program
    public static void main(String[] args) {
        allmissingnumbers allmissingnumbers = new allmissingnumbers();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1}; // Example array
        List<Integer> missingNumbers = allmissingnumbers.findDisappearedNumbers(nums);
        System.out.println("Missing numbers: " + missingNumbers); // Expected output: [5, 6]
    }
}
