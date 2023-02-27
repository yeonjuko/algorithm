package Q3timeOperation;

import java.util.Calendar;

public class Q3 {
    public static void main(String[] args) {
        int waitingList = 14000605;
        solution(waitingList);
    }

    public static void solution(int waitingList){
        int oneYear = 0;

        for(int i = 10; i > 0; i--){
            oneYear += (int)Math.pow(2, i);
        }
        // 1200 = 25*12 + 15*5*12
        int waitingDate = waitingList / 1200;
        int year = waitingDate / oneYear;
        int leftDate = waitingDate % oneYear;
        int month = 0;

        for(int i = 10; i > 0; i--){
            month++;
            if(leftDate < (int)Math.pow(2, i)){
                break;
            }
            leftDate -= (int)Math.pow(2, i);
        }

        int date = leftDate;
        int finalLeft = waitingList % 1200;
        int hour = finalLeft / 100 + 9;
        int[] startMinute = {25, 40, 55, 70, 85, 100};
        int minute = finalLeft % 100 + 1;
        int today_minute = 0;

        for(int i = 0; i < startMinute.length; i++){
            if(startMinute[i] > minute){
                today_minute = i * 10;
                break;
            }
        }

        Calendar today = Calendar.getInstance();
        int 분 = today.get(Calendar.MINUTE) + today_minute;

        if(분 > 60){
            분 = 분 - 60;
            hour++;
        }

        System.out.println((year + 2020) + "년 " + month + "월 " + date + "일 " + hour + "시 " + 분 + "분");

    }

}
