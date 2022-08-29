package Lesson29;
//классы даты и времени

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class TestTime1 {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        LocalDateTime ldt = LocalDateTime.of(2022, Month.AUGUST, 19, 16, 40, 25);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MMMM YYYY, hh:mm");
        System.out.println(ldt.format(f));
    }
}

