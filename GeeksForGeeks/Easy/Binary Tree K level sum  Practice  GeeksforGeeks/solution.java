class Solution {
    static int kLevelSum(String s, int k) {
        // code here
        int i=0;
        int level = -1;
        int ans = 0;
        while(i < s.length()){
            if(s.charAt(i) == '(') level++;
            if(s.charAt(i) == ')') level--;
            if(level == k){
                if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                    int num = 0;
                    while(i<s.length() && (s.charAt(i) >= '0' && s.charAt(i) <= '9')){
                        num = num*10 + s.charAt(i) - '0';
                        i++;
                    }
                    ans = ans+num;
                    continue;
                }
            }
            i++;
        }
        return ans;
    }
};