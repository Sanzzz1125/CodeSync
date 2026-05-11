class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>res=new ArrayList<>();
        HashMap<String,Integer>map=new HashMap<>();
        if(strs.length==0){
            return res;
        }
        int c=0;
        for(String i:strs){
            String s=sort(i);
            if(map.get(s)!=null){
                res.get(map.get(s)).add(i);
            }
            else{
                res.add(new ArrayList<>(Arrays.asList(i)));
                map.put(s,c);
                c++;
            }
        }
        return res;
    }
    public String sort(String a){
        char ch[]=a.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}