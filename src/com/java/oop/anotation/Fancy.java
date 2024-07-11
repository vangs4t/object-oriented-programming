package com.java.oop.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Jadi penggunaan anotation itu untuk menambahkan meta data pada suatu object atau method
 * dan agar memudahkan kita melakukan main tenance
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Fancy {

    String value();

    String[] aplication() default {};

}
