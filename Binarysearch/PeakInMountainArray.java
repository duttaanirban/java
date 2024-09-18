public class PeakInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(arr[ans]);
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
    
}
