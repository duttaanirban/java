public class countingPaths {
    public static void main(String[] args) {
        System.out.println(count(3, 3));
    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1; // Base case: if either row or column is 1, there's only one path
        }

        int left = count (r-1, c);
        int right = count(r, c-1);
        return left + right; // Sum of paths from left and top cells
    }
}
