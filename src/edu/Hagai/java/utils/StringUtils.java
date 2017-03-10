package edu.Hagai.java.utils;

/**
 * Created by Android2017 on 3/10/2017.
 */
public class StringUtils {
    public static String capitalize(String s) {
        String lhs = s.substring(0,1).toUpperCase();
        String rhs = s.substring(1).toLowerCase();
        return lhs + rhs;
    }
}
