import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any positive integer: ");
        int n = sc.nextInt();
        oddeven(n);
        sc.close();
    }

    // method for oddEven
    static void oddeven(int n) {
        if (n % 2 != 0) {
            System.out.println(n + " is odd");
        } else {
            System.out.println(n + " is even");
        }
    }
}
