class Solution {
    public int calPoints(String[] operations) {
        int l = operations.length;
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<l;i++){
            if(operations[i].equals("C")){
                s.pop();
            }
            else if(operations[i].equals("D")){
                int num = s.peek();
                s.push(num*2);
            }
            else if(operations[i].equals("+")){
                int num1 = s.pop();
                int num2 = s.pop();
                s.push(num2);
                s.push(num1);
                s.push(num1+num2);
            }else{
                s.push(Integer.parseInt(operations[i]));
            }
        }
        int sum = 0;
        for (int x : s) {
            sum += x;
        }
        return sum;
    }
}