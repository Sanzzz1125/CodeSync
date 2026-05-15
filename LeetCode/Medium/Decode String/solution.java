class Solution {
    public String decodeString(String s) {
        int num = 0;

        Stack<Integer> dstk = new Stack<>();
        Stack<StringBuilder> stk = new Stack<>();
        StringBuilder curr = new StringBuilder();
        for(char ch : s.toCharArray()){

            if(Character.isDigit(ch)){
                num = num * 10 + (ch - '0');
            }else if(Character.isLetter(ch)){
                curr.append(ch);
            }else if( ch == '['){
                dstk.push(num);
                stk.push(curr);

                num = 0;
                curr = new StringBuilder();
            }else{
                int k = dstk.pop();
                StringBuilder temp = new StringBuilder();

                for(int i=0;i<k;i++){
                    temp.append(curr);
                }

                curr = stk.pop().append(temp);
            }
        }
        return curr.toString();
    }
}