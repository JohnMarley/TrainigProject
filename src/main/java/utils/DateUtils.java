package utils;

import org.junit.Test;

import java.io.ObjectStreamClass;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.Collectors;

public class DateUtils {

    public static String MartcherPeriodYesterday(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String yesterday = LocalDateTime.now().minusDays(1).format(dtf);
        return yesterday+" - "+yesterday;
    }
    public static String MartcherPeriodToday(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDateTime.now().format(dtf)+" - "+LocalDateTime.now().format(dtf);
    }
    public static String MartcherPeriodTomorrow(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String tomorrow = LocalDateTime.now().plusDays(1).format(dtf);
        return tomorrow+" - "+tomorrow;
    }
    public static String MartcherPeriodThisWeek() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String lowerRange = LocalDateTime.now().with(DayOfWeek.SATURDAY).format(dtf);
        String upperRange = LocalDateTime.now().with(DayOfWeek.MONDAY).minusDays(1).format(dtf);
        return upperRange+" - "+lowerRange;
    }

    public Calendar getDateFromSting(SimpleDateFormat simpleDateFormat, String date){
        Date result = null;
        try {
            result = simpleDateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        var c = Calendar.getInstance();
        c.setTime(Objects.requireNonNull(result));
        return c;
    }

    public Calendar addDaysFromCurrentDate(int addDays){
        var c = Calendar.getInstance();
        c.add(Calendar.DATE, addDays);
        return c;
    }

    public List<Calendar> getCurrentWeekStartEndDate(){
        var currentDate = Calendar.getInstance(Locale.US);
        var firstDayOfWeek = currentDate.getFirstDayOfWeek();

        var startDate = Calendar.getInstance(Locale.US);
        startDate.setTime(currentDate.getTime());
        var days = (startDate.get(Calendar.DAY_OF_WEEK) + 7 - firstDayOfWeek) % 7;
        startDate.add(Calendar.DATE, -days);

        Calendar endDate = Calendar.getInstance(Locale.US);
        endDate.setTime(startDate.getTime());
        endDate.add(Calendar.DATE, 6);

        return List.of(startDate, endDate);
    }

}
