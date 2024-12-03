import java.util.Arrays;

public class triangle {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        Selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void pattern(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.print("* ");
            pattern(row, col + 1);
        }
        else {
            System.out.println();
            pattern(row - 1, 0);
        }
    }

    static void pattern2(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            pattern2(row, col + 1);
            System.out.print("* ");
        }
        else {
            pattern2(row - 1, 0);
            System.out.println();
        }
    }

    static void Selection(int[] arr, int row, int col, int max) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[col] > arr[max]) {
                Selection(arr, row, col + 1, col);
            }
            else {
                Selection(arr, row, col + 1, max);
            }
        }
        else {
            int temp = arr[max];
            arr[max] = arr[row - 1];
            arr[row - 1] = temp;
            Selection(arr, row - 1, 0, 0);
        }
    }

}
