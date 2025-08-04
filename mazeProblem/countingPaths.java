public class countingPaths {
    public static void main(String[] args) {
        System.out.println(count(3, 3));
        path("", 3, 3); // Call the path function to print all paths from (3, 3) to (1, 1)
    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1; // Base case: if either row or column is 1, there's only one path
        }

        int left = count (r-1, c);
        int right = count(r, c-1);
        return left + right; // Sum of paths from left and top cells
    }

    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p); // Print the path when reaching the destination
            return;
        }

        if (r > 1) {
            path(p + "D", r - 1, c); // Move down
        }
        if (c > 1) {
            path(p + "R", r, c - 1); // Move right
        }
    }
}
