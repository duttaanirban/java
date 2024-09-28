public class setMismatch {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return new int[] {nums[index], index + 1}; // duplicate and missing number
            }
        }
        return new int[] { -1, -1 }; // Fallback in case no errors are found
    }

    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    public static void main(String[] args) {
        setMismatch setMismatch = new setMismatch();
        
        // Test example array
        int[] nums = {1, 2, 2, 4}; // Example input array
        int[] result = setMismatch.findErrorNums(nums);

        // Output the result
        System.out.println("Duplicate number: " + result[0]);
        System.out.println("Missing number: " + result[1]);
    }
}

