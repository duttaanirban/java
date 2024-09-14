public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNum(nums));
    
    }

    static int findNum(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if(even(num)) {
                count++;
            }
        }
        return count; 
    }

    static boolean even(int num) {
        int numberOfDigits = digits2(num);
        if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;

    }


    //Method1
    static int digits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num  = num/10;
        }
        
        return count;
    }

    //Method2
    static int digits2(int num) {
        
        return (int)(Math.log10(num)) + 1;
    }
    
    
}
