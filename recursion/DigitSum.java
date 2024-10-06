public class DigitSum {
    public static void main(String[] args) {
        int ans = sumOfDigit(1342);
        System.out.println(ans);
    }

    static int sumOfDigit(int n) {
        if (n == 0) {
            return 0;
        }
        return (n%10) + sumOfDigit(n/10);
    }
    
}
