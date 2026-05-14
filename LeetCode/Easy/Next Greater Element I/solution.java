class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int[] arr = new int[n1];
        int k=0;

        for(int i=0;i<n1;i++){
            arr[i] = -1;
            for(int j=0;j<n2;j++){
                if(nums1[i]==nums2[j]){
                    for(int n = j+1;n<n2;n++){
                        if(nums2[n]>nums1[i]){
                            arr[i] = nums2[n];
                            break;
                        }
                    }
                    break;
                }
            }
        }
        
        return arr;
    }
}