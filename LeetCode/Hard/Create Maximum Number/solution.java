class Solution {

    public int[] removeKDigits(int[] arr, int k) {

        int[] result = new int[k];

        k = arr.length - k;
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < arr.length; i += 1) {
            while (!stack.isEmpty() && k > 0 && arr[i] > stack.peek()) {
                stack.pop();
                k -= 1;
            }
            stack.push(arr[i]);
        }

        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k -= 1;
        }

        int i = 0;
        for (int ele: stack) {
            result[i] = ele;
            i += 1;
        }

        return result;

    }

    public int[] merge(int[] arr1, int[] arr2) {
        int i = 0, j = 0, idx = 0;
        int[] mergeArr = new int[arr1.length + arr2.length];
        while (i < arr1.length || j < arr2.length) {
            if (compare(arr1, i, arr2, j)) {
                mergeArr[idx] = arr1[i];
                idx += 1;
                i += 1;
            } else {
                mergeArr[idx] = arr2[j];
                idx += 1;
                j += 1;
            }
        }

        return mergeArr;
    }

    public boolean compare(int[] arr1, int i, int[] arr2, int j) {
        while (i < arr1.length && j < arr2.length && arr1[i] == arr2[j]) {
            i += 1;
            j += 1;
        }

        return j == arr2.length || (i < arr1.length && arr1[i] > arr2[j]);
    }

    public int[] maxNumber(int[] nums1, int[] nums2, int k) {

        int[] maxArr = new int[k];

        int start = Math.max(0, k - nums2.length);
        int end = Math.min(nums1.length, k);

        for (int i = start; i <= end; i += 1) {
            int[] arr1 = removeKDigits(nums1, i);
            int[] arr2 = removeKDigits(nums2, k - i);

            int[] mergeArr = merge(arr1, arr2);

            if (compare(mergeArr, 0, maxArr, 0)) {
                maxArr = mergeArr;
            }
        }

        return maxArr;
    }
}