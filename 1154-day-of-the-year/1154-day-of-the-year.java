class Solution {
    public int dayOfYear(String date) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        if(isLeap(year)) days[1]=29;
        int totalDays = 0;
        for(int i = 0; i < month - 1; i++){
            totalDays += days[i];
        }
        totalDays += day;

        return totalDays;
    }
    public boolean isLeap(int year){
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}