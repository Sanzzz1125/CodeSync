class Solution {
    public int[] sortByReflection(int[] nums) {
        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            String bin = Integer.toBinaryString(nums[i]);
            String rev = new StringBuilder(bin).reverse().toString();
            arr[i] = Integer.parseInt(rev, 2);
        }
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = 0; j<arr.length-i-1; j++) {
                if (arr[j] > arr[j+1] || (arr[j] == arr[j+1] && nums[j] > nums[j+1])) {
                    int r = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = r;

                    r = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = r;
                }
            }
        }
        return nums;
    }
}