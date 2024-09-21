import java.util.Arrays;
public class SearchInSorted2DMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };
        System.out.println(Arrays.toString(search(arr, 5)));  // Output: [1, 1]
    }
    
    static int[] search(int[][] matrix, int target) {
        // Start from top-right corner
        int r = 0;
        int c = matrix[0].length - 1;  // fixed to consider the number of columns in row 0

        // Traverse the matrix
        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};  // Target found
            }

            if (matrix[r][c] < target) {
                r++;  // Move down if the current number is smaller
            } else {
                c--;  // Move left if the current number is larger
            }
        }
        return new int[]{-1, -1};  // Target not found
    }
}
