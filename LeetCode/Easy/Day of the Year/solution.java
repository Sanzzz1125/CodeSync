class Solution {
    public int dayOfYear(String date) {
        String[] arr = date.split("-");
        int year = Integer.parseInt(arr[0]);
        int month = Integer.parseInt(arr[1]);
        int day = Integer.parseInt(arr[2]);

        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if(year % 400==0 || year % 4==0 && year % 100!=0){
            days[1] = 29;
        }
        int res=0;
        for (int i=0; i<month-1; i++) {
            res+=days[i];
        }
        return res+day;
    }
}
