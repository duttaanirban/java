import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Check if the input string is a palindrome and print the result
        System.out.println("Is the string a palindrome? " + isPalindrome2(str));
    }

    static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) {
                return false;
            }
        }
        return true;
    }

    static boolean isPalindrome2(String str) {
       // Convert to lowercase to make the palindrome check case-insensitive
       str = str.toLowerCase();

       // Reverse the string using StringBuilder
       String reversedStr = new StringBuilder(str).reverse().toString();

       // Check if the original string is equal to the reversed string
       return str.equals(reversedStr);
    }
}
