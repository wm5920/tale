package com.tale.utils;

public class StringUtils {
    public static String get(Object o){
        if(o==null)
            return "";
        return o.toString();
    }
}
