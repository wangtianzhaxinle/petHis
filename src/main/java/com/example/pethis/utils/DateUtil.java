package com.example.pethis.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * @projectName: petHis
 * @package: com.example.pethis.utils
 * @className: DateUtil
 * @author: 梁炜轩
 * @description: TODO
 * @date: 2023/3/6 18:25
 * @version: 1.0
 */
public class DateUtil {
    public static String getWitchWeekdayOfTomorrow() {
        Date date = new Date();
        String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int w = cal.get(Calendar.DAY_OF_WEEK);
        if (w < 0) {
            w = 0;
        }
        return weekDays[w];
    }
}