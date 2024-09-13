import java.util.Scanner;

public class SimpleLinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        System.out.println("Enter the element to be searched:");
        int target = input.nextInt(); 
        int ans = linearSearch(nums, target);
        System.out.println(ans);
        input.close();

    }

    static int linearSearch(int [] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }

        for (int i = 0;i<arr.length;i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        return -1;
    }
    
}
