package com.ray.world.common;

import java.sql.Time;
import java.util.Date;

import com.ray.util.TimeUnit;
import com.ray.util.io.Out;

public class DateUtil {

    public static final byte SEC_1_SEC = 1; // 1s = 1秒
    public static final byte SEC_1_MIN = 2; // 1s = 1分
    public static final byte SEC_1_HOU = 3; // 1s = 1时
    public static final byte SEC_1_DAY = 4; // 1s = 1天
    public static final byte SEC_7_DAY = 5; // 1s = 1周
    public static final byte SEC_X_DAY = 6; // 1s = 1旬
    public static final byte SEC_A_MON = 7; // 1s = 1月
    
    public static int TIME_SPEED = SEC_A_MON;
    
    public static long getYears(Date date) {
        Date now = new Date();
        long diff = (now.getTime() - date.getTime()) / 1000;
        
        switch(TIME_SPEED) {
            case SEC_1_SEC : return diff/86400/365;
            case SEC_1_MIN : return diff/1440/365;
            case SEC_1_HOU : return diff/24/365;
            case SEC_1_DAY : return diff/365;
            case SEC_7_DAY : return diff*7/365;
            case SEC_X_DAY : return diff*10/365;
            case SEC_A_MON : return diff*30/365;
        }
        return diff*30/365;
    }
    
    public static void main(String[] args) {
        DateUtil.TIME_SPEED = DateUtil.SEC_A_MON;
        Date t = new Date();
        TimeUnit.SECOND.sleep(70);

        Out.p(getYears(t));

    }
    
}
