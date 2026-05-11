class Solution {
    static void reverse(int[] arr) {
    int left = 0, right = arr.length - 1;
    while (left < right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
}
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        reverse(nums);
        return nums[k-1];
    }
}