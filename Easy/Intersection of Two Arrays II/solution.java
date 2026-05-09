// class Solution {
//     public int[] intersect(int[] nums1, int[] nums2) {
//         Set<Integer> set = new HashSet<>();
//         Set<Integer> res = new HashSet<>();
//         for(int i=0;i<nums1.length;i++){
//             set.add(nums1[i]);
//         }
//         for(int i=0;i<nums2.length;i++){
//             if(set.contains(nums2[i])) res.add(nums2[i]);
//         }

//         int[] arr = new int[res.size()];
//         int idx = 0;
//         for (int num : res) {
//             arr[idx++] = num;
//         }
//         return arr;
//     }
// }

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int i = 0, j = 0, k = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while( i < l1 && j < l2)
        {
            if(nums1[i] < nums2[j])i++;
            else if(nums1[i] > nums2[j]) j++;
            else{
                nums1[k++] = nums1[i++];
                j++;
            }
        }
        return Arrays.copyOfRange(nums1,0,k);
    }
}