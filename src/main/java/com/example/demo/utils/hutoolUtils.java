package com.example.demo.utils;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;

public class hutoolUtils {


    public static DateTime getTime(){return DateUtil.date(System.currentTimeMillis());}
}
