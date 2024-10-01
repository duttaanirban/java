public class pattern7 {
    public static void main(String[] args) {
        ptrn(5);
    }

    static void ptrn(int n) {
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int space = 0; space < n - i; space++) {
                System.out.print("  ");
            }

            // Print decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Print increasing numbers (from 2 to i)
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}

