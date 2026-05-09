class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        char[] arr = p.toCharArray();
        Arrays.sort(arr);
        p = new String(arr);
        int k = p.length();
        for(int i=0;i<s.length();i++){
            if(i>=k-1){
                char[] temp = s.substring(i-(k-1),i+1).toCharArray();
                Arrays.sort(temp);
                String sorted = new String(temp);
                if(sorted.equals(p)){
                    list.add(i-(k-1));
                }
            }
        }
        return list;
    }
}