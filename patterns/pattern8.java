public class pattern8 {
    public static void main(String[] args) {
        ptrn(5);
    }

    static void ptrn(int n) {
        for (int i = 1; i <= 2 * n; i++) {

            int c = i > n ? 2 * n - i : i;
            // Print leading spaces
            for (int space = 0; space < n - c; space++) {
                System.out.print("  ");
            }

            // Print decreasing numbers
            for (int j = c; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // Print increasing numbers (from 2 to i)
            for (int j = 2; j <= c; j++) {
                System.out.print(j + " ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
    
}
