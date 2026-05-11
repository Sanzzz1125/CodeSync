class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int already=0,n=customers.length;
        
        for(int i=0;i<n;i++){
            if(grumpy[i] == 0)
                already += customers[i];
        }

        int newSum = 0;

        for(int i=0;i<minutes;i++){
            if(grumpy[i] == 1){
                newSum += customers[i];
            }
        }

        int max = newSum;

        for(int i=minutes;i<n;i++){
            if(grumpy[i] == 1){
                newSum += customers[i];
            }
            if(grumpy[i - minutes] == 1){
                newSum -= customers[i-minutes];
            }

            max = Math.max(newSum,max);
        }
        return max+already;
    }
}