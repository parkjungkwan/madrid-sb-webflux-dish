package net.zerotodev.api.UserService.util;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class MyUtil {
    public String howLongRemain(LocalDate today, String month, String date){
        Period p = Period.between(today, LocalDate.of(today.getYear(), Integer.parseInt(month), Integer.parseInt(date)));
        return String.format("%s 년 %s 개월, %s 일 남았습니다",p.getYears(), p.getMonths(), p.getDays());
    }
}
