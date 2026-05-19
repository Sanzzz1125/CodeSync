class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int nums1Pointer = 0;
        int nums2Pointer = 0;
        while (nums1Pointer < nums1.length && nums2Pointer < nums2.length) {
            if (nums1[nums1Pointer] == nums2[nums2Pointer]) {
                return nums1[nums1Pointer];
            } else if (nums1[nums1Pointer] > nums2[nums2Pointer]) {
                nums2Pointer++;
            } else {
                nums1Pointer++;
            }
        }

        return -1;
    }
}