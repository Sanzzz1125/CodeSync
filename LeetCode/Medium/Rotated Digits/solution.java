class Solution {
    public int rotatedDigits(int n) {
        int temp = n;
        int cnt = 0;
        while(temp>0){
            int check=0;
            int size = 0;
            int si = temp;
            boolean valid = true;
            boolean differ = false;
            while(si!=0){
                size++;
                si/=10;
            }
            int s = temp;
            while(s!=0){
                int rem = s%10;
                if(rem==2||rem==5||rem==6||rem==9){
                    differ = true;
                }
                if(rem==3||rem==4||rem==7){
                    valid = false;
                }
                s/=10;
            }
            if(valid && differ){
                cnt++;
            }
            temp--;
        }
        return cnt;
    }
}