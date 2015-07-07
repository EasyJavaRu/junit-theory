package ru.easyjava.junit;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assume.assumeTrue;

@RunWith(Theories.class)
public class PowTheoryTest {
    @DataPoint public static double A=4;
    @DataPoint public static int B=-5;
    @DataPoint public static double C=17;
    @DataPoint public static int D=22;
    @DataPoint public static double E=-8;
    @DataPoint public static int F=1;
    @DataPoint public static double G=-1;
    @DataPoint public static int H=0;

    @Theory
    public void isPositive(int base, int exponent) {
        assumeTrue(exponent%2 == 0);
        assertThat((int)Math.pow(base, exponent), anyOf(greaterThan(0), is(0)));
    }

    @Theory
    public void isPositive(double base, int exponent) {
        assumeTrue(exponent%2 == 0);
        assertThat((int)Math.pow(base, exponent), anyOf(greaterThan(0), is(0)));
    }
}
