class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum=0,left=0,max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            sum += cardPoints[i];
        }
        max = Math.max(sum,max);
        int i=k-1,j=n-1;
        while(i>=0){
            sum = sum + cardPoints[j] - cardPoints[i];
            i--;
            j--;
            max = Math.max(max,sum);
        }
        return max;
    }
}