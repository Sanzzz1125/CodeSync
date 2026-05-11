class Solution {
    public String reverseOnlyLetters(String s) {
        char arr[] = s.toCharArray();
        int low=0, high = arr.length-1;
        while(low<high){
            if(!Character.isLetter(arr[low])) low++;
            else if(!Character.isLetter(arr[high])) high--;
            else{
                char temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        return new String(arr);
    }
}