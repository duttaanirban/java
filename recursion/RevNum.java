public class RevNum {
    public static void main(String[] args) {
        // Reverse using rev1
        rev1(1234);
        System.out.println("Reversed number using rev1: " + sum);

        // Reverse using rev2
        System.out.println("Reversed number using rev2: " + rev2(1234));
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
    static int rev2(int n) {
        int digits = (int)(Math.log10(n)) + 1;  // Calculate number of digits
        return helper(n, digits);
    }

    // Helper function for rev2 that reverses the digits recursively
    static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;  // Base case: when n is a single digit
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }
}
