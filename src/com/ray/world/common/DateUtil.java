package com.ray.world.common;

import java.util.Date;

import com.ray.time.Time;
import com.ray.util.io.Out;

public class DateUtil {

    public static final byte SEC_1_SEC = 1; // 1s = 1秒
    public static final byte SEC_1_MIN = 2; // 1s = 1分
    public static final byte SEC_1_HOU = 3; // 1s = 1时
    public static final byte SEC_1_DAY = 4; // 1s = 1天
    public static final byte SEC_7_DAY = 5; // 1s = 1周
    public static final byte SEC_X_DAY = 6; // 1s = 1旬
    public static final byte SEC_A_MON = 7; // 1s = 1月
    public static final byte SEC_A_SIN = 8; // 1s = 1季
    
    public static int TIME_SPEED = SEC_A_MON;
    
    public static int[] getAge(Date date) {
        Date now = new Date();
        long diff = (now.getTime() - date.getTime()) / 1000;
        
        // 获取转换后的天数
        switch(TIME_SPEED) {
            case SEC_1_SEC : diff = diff/86400;
            case SEC_1_MIN : diff = diff/1440;
            case SEC_1_HOU : diff = diff/24;
            case SEC_7_DAY : diff = diff*7;
            case SEC_X_DAY : diff = diff*10;
            case SEC_A_MON : diff = diff*30;
            case SEC_A_SIN : diff = diff*90;
        }
        
        long years = diff / 365;
        diff %= 365;
        
        long months =  (diff / 30);
        diff %= 30;
        
        long days =  diff;
        
        return new int[] {(int) years, (int) months, (int) days};
        
    }
    
    public static void main(String[] args) {
        DateUtil.TIME_SPEED = DateUtil.SEC_1_DAY;
        
        Date t = Time.create(2018, 3, 20, 16, 00, 30);

        Out.p(getAge(t));

    }
    
}
