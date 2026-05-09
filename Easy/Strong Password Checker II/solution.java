class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length()<8) return false;
        int f1=0,f2=0,f3=0,f4=0;
        for(int i=0;i<password.length();i++){
            char ch = password.charAt(i);
            if( i>0 && ch==password.charAt(i-1)) return false;

            if(Character.isLowerCase(ch)) f1=1;
            if(Character.isUpperCase(ch)) f2=1;
            if(Character.isDigit(ch)) f3=1;
            if("!@#$%^&*()-+".indexOf(ch)!=-1) f4=1;
        }
        if(f1==1&& f2==1 && f3==1 && f4==1) return true;
        return false;
    }
}