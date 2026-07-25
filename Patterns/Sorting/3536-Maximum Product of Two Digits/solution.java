class Solution {
    public int maxProduct(int n) {
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        int temp = n;
        while(temp>0){
            int rem = temp%10;
            if(rem > max) max = rem;
            list.add(rem);
            temp/=10;
        }

        Collections.sort(list);
        temp = list.get(list.size()-2);
        max *= temp;
        return max;
    }
}