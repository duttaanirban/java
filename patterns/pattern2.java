public class pattern2 {
    public static void main(String[] args) {
        pattern(5);  // Call the pattern function with n = 5
    }

    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");  // Use print instead of println
            }
            System.out.println();  // Move to the next line after each row
        }
    }
}
