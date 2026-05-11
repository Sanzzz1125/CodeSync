class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<bank.length;i++){
            int cnt=0;
            for(char ch: bank[i].toCharArray()){
                if(ch=='1') cnt++;
            }
            if(cnt!=0) list.add(cnt);
        }

        int sum = 0;
        for(int i=1;i<list.size();i++){
            sum += list.get(i)*list.get(i-1);
        }
        return sum;
    }
}