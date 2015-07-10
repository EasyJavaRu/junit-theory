package ru.easyjava.junit;

import org.junit.Rule;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class StringConversionTest {
    @DataPoint public static String A = "q";
    @DataPoint
    public static String B = "w";
    //Next line will fail
    //@DataPoint public static String C = "17";

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Theory
    public void StringNotANumber(String value) {
        thrown.expect(NumberFormatException.class);
        Integer.valueOf(value);
    }
}
