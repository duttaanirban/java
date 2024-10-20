public class palindrome {
    public static void main(String[] args) {
        int number = 12321;
        if (palin(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    static int sum = 0;

    // rev1: Uses a global sum variable to reverse the number
    static void rev1(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        rev1(n / 10);
    }

    // rev2: Reverses the number and returns the result
    static int rev(int n) {
        sum = 0; // Reset sum before reversing
        rev1(n); // Use rev1 to reverse the number
        return sum;
    }

    // Checks if a number is a palindrome
    static boolean palin(int n) {
        return n == rev(n); // Check if the number is equal to its reverse
    }
}
