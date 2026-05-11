class Solution {
    public String reverseWords(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        String arr[] = rev.split(" ");
        int low=0, high=arr.length-1;
        while(low<high){
            String temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        s="";
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                s+=arr[i];
                continue;
            }
            s+=arr[i] +" ";
        }
        return s;
    }
}