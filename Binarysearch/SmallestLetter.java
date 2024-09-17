public class SmallestLetter {
    public static void main(String[] args) {
       char[] letters = {'c','f','j'};
       char target = 'a';
       System.out.println(nextGreatestLetter(letters, target));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        
            // Initialize the start and end indices of the search range
            int start = 0;
            int end = letters.length - 1;
    
            // Loop until the start index exceeds the end index
            while (start <= end) {
                // Calculate the middle index of the current search range
                int mid = start + (end - start) / 2;
    
                // If target is smaller than mid element, search in the left half
                if (target < letters[mid]) {
                    end = mid - 1;
                }
                // If target is larger than mid element, search in the right half
                else {
                    start = mid + 1;
                }
        
            }
            return letters[start % letters.length];
        
    }
}
