class Solution {
    public int firstUniqChar(String s) {
        int freq[] = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i) - 'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i) - 'a']==1) return i;
        }
        return -1;
        // int n = s.length();
        // int [] arr = new int[n];
        // for(int i=0;i<s.length();i++){
        //     for(int j=0;j<s.length();j++){
        //         if(s.charAt(j)==s.charAt(i)) arr[j] +=1;
        //     }
        // }
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==1) return i;
        // }
        // return -1;
    }
}