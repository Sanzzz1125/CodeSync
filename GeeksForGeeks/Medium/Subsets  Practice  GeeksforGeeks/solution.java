import java.util.*;
class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        Arrays.sort(arr);
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        helper(arr, 0, new ArrayList<>(), res);
        
        return res;
    }

    private void helper(int[] arr, int index,ArrayList<Integer> curr,ArrayList<ArrayList<Integer>> res) {
        if (index == arr.length) {
            
            res.add(new ArrayList<>(curr));
            return;
        }
        curr.add(arr[index]);
        
        helper(arr, index + 1, curr, res);
        
        curr.remove(curr.size() - 1);
        
        helper(arr, index + 1, curr, res);
    }
}
