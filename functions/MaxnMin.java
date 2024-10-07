import java.util.Scanner;

public class MaxnMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter num1:");
        int num1 = sc.nextInt();
        
        System.out.println("Enter num2:");
        int num2 = sc.nextInt();
        
        System.out.println("Enter num3:");
        int num3 = sc.nextInt();
        
        // int largest = largest(num1, num2, num3);
        // System.out.println("The largest number is: " + largest);

        int smallest = smallest(num1, num2, num3);
        System.out.println("The smallest number is: " + smallest);

        sc.close();
    }

    static int largest(int num1, int num2, int num3) {
        int max = num1;
        
        if (num2 > max) {
            max = num2;
        }
        
        if (num3 > max) {
            max = num3;
        }
        
        return max;
    }

    static int smallest(int num1, int num2, int num3) {
        int min = num1;
        
        if (num2 < min) {
            min = num2;
        }
        
        if (num3 < min) {
            min = num3;
        }
        
        return min;
    }
}
