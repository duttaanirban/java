public class pattern6 {
    public static void main(String[] args) {
        ptrn(5);
    }

    static void ptrn(int n) {
        for (int i = 0; i <= 2 * n; i++) {
            int totCol = i > n ? 2 * n - i : i;

            int noOfSpaces = n - totCol;
            for (int j = 0; j < noOfSpaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < totCol; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
