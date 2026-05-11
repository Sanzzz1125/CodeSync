class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] arr1=new int[26];
        int[] arr2=new int[26];
        List<Integer> ans=new ArrayList<Integer>();
        if(p.length()>s.length()){
            return ans;
        }
        for(char ch : p.toCharArray()){
            arr2[ch-'a']+=1;
        }
        for(int i=0;i<p.length();i++){
            arr1[s.charAt(i)-'a']+=1;
        }
        if(Arrays.equals(arr1,arr2)){
            ans.add(0);
        }
        for(int i=p.length();i<s.length();i++){
            arr1[s.charAt(i)-'a']+=1;
            arr1[s.charAt(i-p.length())-'a']-=1;
        
            if(Arrays.equals(arr1,arr2)){
                ans.add(i-p.length()+1);
            }
        }
        return ans;
    }
}