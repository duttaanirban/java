import java.util.Scanner;

public class CeilingOfNumber {
    public static void main(String[] args) {
        // Sample sorted array
        int[] arr = {-10, -4, 4, 6, 8, 9, 10, 12, 14, 15, 17, 19};
        
        // Input the target value from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target element:");
        int target = sc.nextInt();

        // Call the binary search method to find the ceiling of the target
        int index = CeilingofNum(arr, target);

        // Print the result: the ceiling value and its index
        if (index >= arr.length) {
            System.out.println("There is no ceiling value for " + target);
        } else {
            System.out.println("The ceiling of " + target + " is " + arr[index] + " at index " + index);
        }
        sc.close();
    }

    // Method to find the ceiling of a number (smallest number >= target) in a sorted array
    static int CeilingofNum(int[] arr, int target) {
        // Initialize the start and end indices of the search range
        int start = 0;
        int end = arr.length - 1;

        // Loop until the start index exceeds the end index
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

        // Return 'start' because it points to the smallest number >= target
        return start;
    }
}
