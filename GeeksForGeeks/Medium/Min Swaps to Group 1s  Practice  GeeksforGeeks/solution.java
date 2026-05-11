class Solution {
    public int minSwaps(int[] arr) {
        // code here
        int ones = 0;
        for (int num : arr) {
            if (num == 1) ones++;
        }
        if(ones == 0) return -1;
        if(ones == 1) return 0;
        int zeros=0;
        
        for(int i=0;i<ones;i++){
            if(arr[i] == 0) zeros++;
        }
        
        int min = zeros;
        
        for(int i=ones;i<arr.length;i++){
            if(arr[i] == 0) zeros++;
            
            if(arr[i-ones] == 0) zeros--;
            
            min = Math.min(min,zeros);
        }
        
        return min;
    }
}
