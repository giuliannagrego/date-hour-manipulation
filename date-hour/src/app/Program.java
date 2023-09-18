package app;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Program {
    public static void main(String[] args) {
        LocalDate d01 = LocalDate.parse("2023-07-29");
        LocalDateTime d02 = LocalDateTime.parse("2023-07-29T01:30:55");
        Instant d03 = Instant.parse("2023-07-29T01:30:55Z");

        LocalDate ld01 = LocalDate.ofInstant(d03,ZoneId.systemDefault());
        LocalDate ld02 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));

        LocalDateTime ldt01 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime ldt02 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));

        System.out.println("Operações importantes com data-hora");
        System.out.println();

        System.out.println("date 1 = " + d01);
        System.out.println("date 2 = " + d02);
        System.out.println("date 3 = " + d03);

        System.out.println();
        System.out.println("Converter data-hora global para local:");
        System.out.println();

        System.out.println("date default local = " + ld01);
        System.out.println("date in Portugal = " + ld02);

        System.out.println("date and time in default local = " + ldt01);
        System.out.println("date and time in Portugal = " + ldt02);

        System.out.println();
        System.out.println("Obter dados de uma data-hora local:");
        System.out.println();

        System.out.println("date 1, day = " + d01.getDayOfMonth());
        System.out.println("date 1, month = " + d01.getMonthValue());
        System.out.println("date 1, year = " + d01.getYear());

        System.out.println("date 2, hour = " + d02.getHour());
        System.out.println("date 2, hour = " + d02.getMinute());

        System.out.println();
        System.out.println("Cálculos com data-hora:");
        System.out.println();

        LocalDate pastWeekLocalDate01 = d01.minusDays(7);
        LocalDate nextWeekLocalDate01 = d01.plusDays(7);

        System.out.println("past week of date 1 = " + pastWeekLocalDate01);
        System.out.println("next week of date 1 = " + nextWeekLocalDate01);

        LocalDateTime pastWeekLocalDateTime02 = d02.minusDays(7);
        LocalDateTime nextWeekLocalDateTime02 = d02.plusDays(7);

        System.out.println("past week of date 2 = " + pastWeekLocalDateTime02);
        System.out.println("next week of date 2 = " + nextWeekLocalDateTime02);

        Instant pastWeekInstant03 = d03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant03 = d03.plus(7, ChronoUnit.DAYS);

        System.out.println("past week of date 3 = " + pastWeekInstant03);
        System.out.println("next week of date 3 = " + nextWeekInstant03);

        Duration t1 = Duration.between(pastWeekLocalDate01.atStartOfDay(), d01.atTime(0, 0));  // .atStartOfDay == .atTime(0, 0);
        Duration t2 = Duration.between(pastWeekLocalDateTime02, d02);
        Duration t3 = Duration.between(pastWeekInstant03, d03);
        Duration t4 = Duration.between(d03, pastWeekInstant03);

        System.out.println();
        System.out.println("Cálculo de duração entre duas data-horas:");
        System.out.println();
        System.out.println("duration t1 on days = " + t1.toDays());
        System.out.println("duration t2 on days = " + t2.toDays());
        System.out.println("duration t3 on days = " + t3.toDays());
        System.out.println("duration t2 on days = " + t4.toDays());


    }
}
