package common;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DateTimeGenerator extends Generator {

    public DateTimeGenerator() {
        super();
    }

    public DateTimeGenerator(Locale locale, Long seed) {
        super(locale, seed);
    }

    public LocalDate getDate() {
        LocalDate start = LocalDate.of(1900, Month.JANUARY, 1);
        long days = ChronoUnit.DAYS.between(start, LocalDate.now());
        return start.plusDays(r.getInt((int) days + 1));
    }

    public String getStrDate() {
        return getDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd", locale));
    }

    public String getLocalizedDate(FormatStyle format) {
        format = format != null ? format : FormatStyle.SHORT;
        return getDate().format(DateTimeFormatter.ofLocalizedDate(format).withLocale(locale));
    }

    public LocalTime getTime() {
        return LocalTime.MIN.plusSeconds(r.getLong());
    }

    public String getStrTime() {
        return getTime().format(DateTimeFormatter.ofPattern("HH:mm", locale));
    }

    public String getLocalizedTime(FormatStyle format) {
        format = format != null ? format : FormatStyle.SHORT;
        return getTime().format(DateTimeFormatter.ofLocalizedDate(format).withLocale(locale));
    }
}
