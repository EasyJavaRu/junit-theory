package ru.easyjava.junit;

import org.junit.Test;

import java.util.Calendar;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assume.assumeThat;

public class LocalizedDateServiceTest {
    private LocalizedDateService testedObject = new LocalizedDateService();

    @Test
    public void testFormatDate() throws Exception {
        assumeThat(System.getProperty("user.language"), is("ru"));
        Calendar date = Calendar.getInstance();
        date.set(1961, 4, 21, 9, 7, 0);
        assertThat(testedObject.formatDate(date.getTime()), is("Вс, май 21, '61"));
    }

    @Test
    public void testFormatDateTW() throws Exception {
        assumeThat(System.getProperty("user.language"), is("tw"));
        Calendar date = Calendar.getInstance();
        date.set(1961, 4, 21, 9, 7, 0);
        assertThat(testedObject.formatDate(date.getTime()), is("星期日, 五月 21, '61"));
    }
}
