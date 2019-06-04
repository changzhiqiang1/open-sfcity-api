package com.changzhiqiang.sf.util;

import java.text.SimpleDateFormat;

/**
 * @Author: changzhiqiang
 * @Date: 2019-05-22 10:23
 */
public final class DateUtil {

    public static Long currentSecond() {
        return (System.currentTimeMillis() / 1000);
    }

    public static String format(Long ms, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(ms * 1000);
    }
}
