class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            sum += cardPoints[i];
        }
        max = Math.max(sum,max);
        for(int i=k-1,j=n-1;i>=0;i--,j--){
            sum = sum + cardPoints[j] - cardPoints[i];
            max = Math.max(max,sum);
        }
        return max;
    }
}