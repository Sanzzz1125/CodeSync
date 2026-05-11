class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }else{
                    row.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
                }
            } 
            if(i==rowIndex){
                for(int k=0;k<row.size();k++){
                    res.add(row.get(k));
                }
            }
            list.add(row);
        }
        return res;
    }
}