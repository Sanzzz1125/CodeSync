class Solution {
    public String reformatDate(String date) {
        String [] arr = date.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            if(i==arr.length-1){
                sb.append(arr[i] + "-");
                continue;
            }
            else if(i==1){
                if (arr[i].equals("Jan")) sb.append("01-");
                else if (arr[i].equals("Feb")) sb.append("02-");
                else if (arr[i].equals("Mar")) sb.append("03-");
                else if (arr[i].equals("Apr")) sb.append("04-");
                else if (arr[i].equals("May")) sb.append("05-");
                else if (arr[i].equals("Jun")) sb.append("06-");
                else if (arr[i].equals("Jul")) sb.append("07-");
                else if (arr[i].equals("Aug")) sb.append("08-");
                else if (arr[i].equals("Sep")) sb.append("09-");
                else if (arr[i].equals("Oct")) sb.append("10-");
                else if (arr[i].equals("Nov")) sb.append("11-");
                else if (arr[i].equals("Dec")) sb.append("12-");
            }
            else if(i==0){
                if(arr[i].length()==3){
                    sb.append("0");
                    sb.append(arr[i].charAt(0));
                }
                else{
                    sb.append(arr[i].charAt(0));
                    sb.append(arr[i].charAt(1));
                }
            }
        }
        return sb.toString();
    }
}