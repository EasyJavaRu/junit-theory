package ru.easyjava.junit;

import org.junit.experimental.theories.ParametersSuppliedBy;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
@ParametersSuppliedBy(LongitudesSupplier.class)
public @interface Longitudes {}
