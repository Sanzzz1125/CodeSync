class Solution {
    // Function to find the minimum element in sorted and rotated array.
    static int minNumber(int arr[], int low, int high) {
        // Your code here
       low = 0;
       high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < arr[high]) {
                high = mid;
            } 
            else if (arr[mid] > arr[high]) {
                low = mid + 1;
            } 
            else {
                high--;
            }
        }

        return arr[low];
    }
}