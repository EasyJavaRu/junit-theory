package ru.easyjava.junit;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Locale-aware (hehe) date formatting service.
 */
public class LocalizedDateService {
    /**
     * Pre-configured date format.
     */
    private final DateFormat dateFormat =
            new SimpleDateFormat("EEE, MMM d, ''yy");

    /**
     * Formats date in a human friendly form.
     * @param date Date to format.
     * @return Formatted date with locale taken into account.
     */
    public final String formatDate(final Date date) {
        return dateFormat.format(date);
    }
}

