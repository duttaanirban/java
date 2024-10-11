import java.util.Scanner;
public class primeNumBetnTwoNum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Declare the variables
        int a, b, i, j, flag;

        // Ask user to enter lower value of interval
        System.out.printf("Enter lower bound of the interval: ");
        a = sc.nextInt(); // Take input

        // Ask user to enter upper value of interval
        System.out.printf("\nEnter upper bound of the interval: ");
        b = sc.nextInt(); // Take input

        // Print display message
        System.out.printf("\nPrime numbers between %d and %d are: ", a, b);

        // Traverse each number in the interval
        // with the help of for loop
        for (i = a; i <= b; i++) {

            // Skip 0 and 1 as they are
            // neither prime nor composite
            if (i == 1 || i == 0)
                continue;

            // flag variable to tell
            // if i is prime or not
            flag = 1;

            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }

            // flag = 1 means i is prime
            // and flag = 0 means i is not prime
            if (flag == 1)
                System.out.println(i);
        }
    }
}
