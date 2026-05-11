class Solution {
    public int residuePrefixes(String s) {
        HashSet<String> set = new HashSet<>();
        String arr[] = s.split("");
        int cnt=0; 
        for(int i=0;i<arr.length;i++){
            int prefix = i+1;
            if(!set.contains(arr[i])) set.add(arr[i]);
            if(set.size()==prefix%3) cnt++;
        }
        return cnt;
    }
}