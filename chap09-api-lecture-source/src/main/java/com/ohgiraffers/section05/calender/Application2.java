package com.ohgiraffers.section05.calender;

/* 수업목표. java.util.Calendar 클래스 사용법을 이해하고 사용할 수 있다. */
/* 필기.
*   Date형 대비 개선점
*   1. timezone과 관련된 기능이 추가
*   2. 윤년 관련 기능이 내부적으로 추가
*   3. 날짜 및 시간 필드 개념을 추가해 불필요한 메소드명을 줄임
* */

import com.sun.security.jgss.GSSUtil;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Application2 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar = " + calendar);

        Calendar calendar2 = new GregorianCalendar();
        System.out.println(calendar2.get(Calendar.YEAR));

        int year = 2001;
        int month = 9-1;          // 9월
        int dayOfMonth = 17;
        int hour = 23;
        int min = 30;
        int second = 0;

        Calendar birthDay = new GregorianCalendar(year, month, dayOfMonth, hour, min, second);
        System.out.println(birthDay);

        System.out.println("태어난 해: " + birthDay.get(1));
        System.out.println("태어난 해: " + birthDay.get(Calendar.YEAR));
        System.out.println("태어난 월: " + (birthDay.get(Calendar.MONTH) + 1));
        System.out.println("태어난 일: " + birthDay.get(Calendar.DAY_OF_MONTH));
        System.out.println("태어난 요일: " + birthDay.get(Calendar.DAY_OF_WEEK));

        String day = "";
        int dayNum = birthDay.get(Calendar.DAY_OF_WEEK);

        switch(dayNum) {
            case Calendar.SUNDAY:
                day = "일";
                break;
            case 2:
                day = "월";
                break;
            case 3:
                day = "화";
                break;
            case 4:
                day = "수";
                break;
            case 5:
                day = "목";
                break;
            case 6:
                day = "금";
                break;
            case 7:
                day = "토";
                break;
        }
        System.out.println("나는 " + day + "요일에 탄생했지");

        System.out.println("AM/PM: " + birthDay.get(Calendar.AM_PM));           // 0은 오전, 1일 오후
        System.out.println("hourOfDay: " + birthDay.get(Calendar.HOUR_OF_DAY)); // 24시간 체계
        System.out.println("hour: " + birthDay.get(Calendar.HOUR));             // 12시간 체계
        System.out.println("min: " + birthDay.get(Calendar.MINUTE));
        System.out.println("sec: " + birthDay.get(Calendar.SECOND));

        /* 설명. SimpleDateFormat 활용(java.util.Date형으로 변환) */
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss E요일");
        String birthDayString = sdf.format(new java.util.Date(birthDay.getTimeInMillis()));
        System.out.println("birthDayString: " + birthDayString);
    }
}
