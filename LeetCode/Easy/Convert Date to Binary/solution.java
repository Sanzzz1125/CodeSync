class Solution {
    public String convertDateToBinary(String date) {
        String arr[] = date.split("-");
        for (int i = 0; i < arr.length; i++) {
            StringBuilder sb = new StringBuilder();
            int num = Integer.parseInt(arr[i]);
            while (num != 0) {
                int rem = num % 2;
                sb.append(rem);
                num /= 2;
            }
            arr[i] = sb.reverse().toString();
        }
        date = "";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                date += arr[i];
            } else {
                date += arr[i] + "-";
            }
        }
        return date;
    }
}