class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0;
        for(int i = cardPoints.length-1 ;i>=0 && k!=0;i--){
            sum += cardPoints[i];
            k--;
        }
        return sum;
    }
}