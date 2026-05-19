class Solution {
    public int maxMeetings(int start[], int end[]) {
        int check=0,cnt=0;
        
        for (int i = 0; i < end.length; i++) {
            for (int j = 0; j < end.length - i - 1; j++) {
                if (end[j] > end[j + 1]) {
                    int temp = end[j];
                    end[j] = end[j + 1];
                    end[j + 1] = temp;
                    
                    temp = start[j];
                    start[j] = start[j + 1];
                    start[j + 1] = temp;
                }
            }
        }
        
        for(int i=0;i<start.length;i++){
            for(int j=0;j<end.length;j++){
                if(i==0){
                    if(start[i]>=check){
                        check = end[i];
                        cnt++;
                        break;
                    }
                }
                else if(start[i]>check){
                    check = end[i];
                    cnt++;
                    break;
                }else{
                    j = end.length;
                }
            }
        }
        
        return cnt;
    }
}
