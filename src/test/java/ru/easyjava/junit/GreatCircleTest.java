package ru.easyjava.junit;

import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

@RunWith(Theories.class)
public class GreatCircleTest {
    @Theory
    public void constrainGreatCircleLength(
            @Latitudes double latDeparture, @Longitudes double lonDeparture,
            @Latitudes double latDestination, @Longitudes double lonDestination) {
            assertThat(
                    (int)GreatCircle.distance(latDeparture, lonDeparture, latDestination, lonDestination),
                    allOf(greaterThanOrEqualTo(0), lessThanOrEqualTo(20001)));
    }
}
