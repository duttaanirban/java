package arrays;

public class findElements {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 5, 8, 4, 12};
        System.out.println(findele(arr, 4, 0));
        System.out.println(find(arr, 4, 0));
        System.out.println(findFromLast(arr, 4, arr.length - 1));
    }

    static boolean findele(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || findele(arr, target, index+1);
    }

    static int find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        else {
        return find(arr, target, index+1);
        }
    }

        static int findFromLast(int[] arr, int target, int index) {
            if (index == -1) {
                return -1;
            }
            if (arr[index] == target) {
                return index;
            }
            else {
            return findFromLast(arr, target, index-1);
            }
        }
}
