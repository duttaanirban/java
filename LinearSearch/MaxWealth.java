public class MaxWealth {

    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        
        // Create an instance of the MaxWealth class
        MaxWealth obj = new MaxWealth();
        
        // Pass the accounts array to the maximumwealth method
        int res = obj.maximumwealth(accounts);
        
        // Print the result
        System.out.println(res);
    }

    // Non-static method to calculate the maximum wealth
    public int maximumwealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
