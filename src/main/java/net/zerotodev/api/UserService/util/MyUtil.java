package net.zerotodev.api.UserService.util;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

public class MyUtil {
    public String howLongRemain(LocalDate today, String month, String date){
        Period p = Period.between(today, LocalDate.of(today.getYear(), Integer.parseInt(month), Integer.parseInt(date)));
        return String.format("%s 년 %s 개월, %s 일 남았습니다",p.getYears(), p.getMonths(), p.getDays());
    }
    public String usedTime(String hour1, String min1, String sec1,
                           String hour2, String min2, String sec2){
        return "총 이용시간: "+getTime((int)Duration.between(
                getLocalTime(hour1, min1, sec1),getLocalTime(hour2, min2, sec2)).getSeconds());
    }
    private LocalTime getLocalTime(String hour, String min, String sec){
        return LocalTime.of(Integer.parseInt(hour),Integer.parseInt(min),Integer.parseInt(sec));
    }
    private String getTime(int sec){
        int hour = sec / (60*60);
        int minute =(sec - hour*(60*60))/60;
        int second = sec % 60;
        return String.format("%d 시간, %d 분, %s 초", hour, minute, second);
    }
}
