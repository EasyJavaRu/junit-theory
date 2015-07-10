package ru.easyjava.junit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;
import org.junit.rules.TestRule;

import java.util.Calendar;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assume.assumeThat;

public class LocaleLocalizedDateServiceTest {
    private LocalizedDateService testedObject = new LocalizedDateService();

    //@Rule
    //public LocaleRule localeRule = new LocaleRule();

    //@Rule
    //public LocaleWatcherRule watcherRule = new LocaleWatcherRule();

    @Rule
    public TestRule localesRule = RuleChain
            .outerRule(new LocaleRule())
            .around(new LocaleWatcherRule());

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
