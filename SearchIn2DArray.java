import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target element:");
        int target = sc.nextInt();
        int[][] arr = {
            {23, 4, 1},
            {18, 12, 3, 9},
            {78, 99, 34, 56},
            {18, 12}
        };
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        sc.close();
    }
    

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if( arr[row][col] == target) {
                    return new int[]{row, col};
                }
            } 
        }
        return new int[]{-1, -1};
    }
}
