public class pattern5 {
    public static void main(String[] args) {
        ptrn(5);
    }

    static void ptrn(int n) {
        for (int i = 0; i <= 2 * n; i++) {
            int totCol = i > n ? 2 * n - i : i;
            for (int j = 0; j < totCol; j++) {
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
