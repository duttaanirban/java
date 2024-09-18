public class FindInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = binarysearch(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }

        return OrderAgnosticsBs(arr, target, peak+1, arr.length-1) ;

    }

    static int peakIndexInMountainArray(int[] arr) {
        
        int start = 0;
        int end = arr.length - 1;

        while ( start < end ) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // you are in the dec. part of the array
                // this may be the ans, but check at left
                // this is why end!= mid-1
                end = mid;
            }
            else {
                // you are in asc order of the array
                start = mid + 1;
            }
        }
         return start;
    }

    static int binarysearch(int[] arr, int target, int start, int end) {
        // Loop until the start index is greater than the end index
        while (start <= end) {
            // Calculate the middle index of the current search range
            int mid = start + (end - start) / 2;

            // Check if the target is less than the middle element
            if (target < arr[mid]) {
                // Narrow the search to the left half
                end = mid - 1;
            }
            // Check if the target is greater than the middle element
            else if (target > arr[mid]) {
                // Narrow the search to the right half
                start = mid + 1;
            }
            
            // If the target is equal to the middle element, return the index
            
            else {
                return mid;
            }
        }
        
        // If the target is not found, return -1
        return -1;  
    }

    static int OrderAgnosticsBs(int[] arr, int target, int start, int end) {
        //find the array is sorted
        boolean isAsc = arr[start] < arr[end];
        


        while (start <= end) {
            // Calculate the middle index of the current search range
            int mid = start + (end - start) / 2;


            if(arr[mid] == target) {
                return mid;
             }
            
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid -1;
                }

                else  {
                    start = mid + 1;
                }

            }

                else  { 
                    if (target > arr[mid]) {
                    end = mid - 1;
                }

                else  {
                    start = mid + 1;
                }
            }
            
        }
        return -1;
    }
    
}
