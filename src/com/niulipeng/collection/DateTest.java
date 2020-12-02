package com.niulipeng.collection;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Auther:niulipeng
 * @Date:2020/11/25
 * @Description:com.niulipeng.collection
 * @Version:1.0
 */
    
public class DateTest {
    public static void main(String[] args) {
        Calendar cl = Calendar.getInstance();
        System.out.println(cl);
        Date d = new Date();
        DateFormat date = new SimpleDateFormat("yyyy-hh-mm HH:MM:ss");
        System.out.println(cl.getTime());
        System.out.println(date.format(cl.getTime()));
        System.out.println(cl.get(Calendar.DATE));
        System.out.println(cl.get(Calendar.YEAR));
    }
}
