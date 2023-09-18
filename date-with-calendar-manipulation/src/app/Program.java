package app;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2023-07-29T15:42:08Z"));

        System.out.println("base date: " + sdf.format(d));
        System.out.println();

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);

        // base date + 4 hour
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();

        // get time unity
        int minutes = cal.get(Calendar.MINUTE);
        int month = 1 + cal.get(Calendar.MONTH); // o Calendar começa no mês 0 [Janeiro], para pegar o mês correto terá de somar +1


        System.out.println("base date + 4 hours: " + sdf.format(d));
        System.out.println();
        System.out.println("Obtendo uma unidade de tempo:");
        System.out.println("minutes: " + minutes);
        System.out.println("month: " + month);
    }
}
