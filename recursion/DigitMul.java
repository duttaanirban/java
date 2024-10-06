public class DigitMul {
    public static void main(String[] args) {
        int ans = productOfDigit(1342);
        System.out.println(ans);
    }

    static int productOfDigit(int n) {
        if (n%10 == n) {
            return n;
        }
        return (n%10) * productOfDigit(n/10);
    }
}
