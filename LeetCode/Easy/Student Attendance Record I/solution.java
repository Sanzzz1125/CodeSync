    class Solution {
        public boolean checkRecord(String s) {
            int cntA=0,cntL=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='A') cntA++;
                if(cntA>=2) return false;

                if(s.charAt(i)=='L'){
                    cntL++;
                    if(i+1<s.length()){
                        if(s.charAt(i+1)=='L'){
                            cntL++;
                            if(i+2<s.length()){
                                if(s.charAt(i+2)=='L'){
                                    cntL++;
                                }
                            }
                        }
                    }
                }
                if(cntL<3) cntL=0;
            }
            if(cntL>=3) return false;
            return true;
        }
    }