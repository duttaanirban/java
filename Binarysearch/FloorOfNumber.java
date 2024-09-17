import java.util.Scanner;

public class FloorOfNumber {
    public static void main(String[] args) {
        // Sample sorted array
        int[] arr = {-10, -4, 4, 6, 8, 9, 10, 12, 14, 15, 17, 19};
        
        // Input the target value from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target element:");
        int target = sc.nextInt();

        // Call the binary search method to find the floor of the target
        int index = FloorOfNum(arr, target);

        // Print the result: the floor value and its index
        if (index == -1) {
            System.out.println("There is no floor value for " + target);
        } else {
            System.out.println("The floor of " + target + " is " + arr[index] + " at index " + index);
        }
        sc.close();
    }

    // Method to find the floor of a number (largest number <= target) in a sorted array
    static int FloorOfNum(int[] arr, int target) {
        // Initialize the start and end indices of the search range
        int start = 0;
        int end = arr.length - 1;

        // Loop through the array until the start index surpasses the end index
        while (start <= end) {
            // Calculate the middle index of the current search range
            int mid = start + (end - start) / 2;

            // If target is smaller than mid element, search in the left half
            if (target < arr[mid]) {
                end = mid - 1;
            }
            // If target is larger than mid element, search in the right half
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            // If the target is equal to the mid element, return the index
            else {
                return mid;
            }
        }
        
        // Return 'end' because it points to the largest number <= target
        return end;
    }
}

