class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String arr[] = s.split("[^a-z0-9]");
        s="";
        for(int i=0;i<arr.length;i++){
            s +=arr[i];
        }
        int low=0,high=s.length()-1;
        while(low<high){
            if(s.charAt(low)!=s.charAt(high)) return false;
            else if(s.charAt(low)==s.charAt(high)){
                low++;
                high--;
                continue;
            }
        }
        return true;
    }
}