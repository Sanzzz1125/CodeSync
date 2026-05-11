class Solution {
    public int maximum69Number (int num) {
        char[] nums = String.valueOf(num).toCharArray(); 
        boolean valid = true;
        int i=0;
        while(valid && i<nums.length){
            if(nums[i]=='6'){
                nums[i]='9';
                valid = false;
            }
            i++;
        }
        return Integer.parseInt(new String(nums));
    }
}