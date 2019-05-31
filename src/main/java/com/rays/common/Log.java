package com.rays.common;

import org.apache.commons.logging.LogFactory;

public class Log {
    
    static org.apache.commons.logging.Log logger;
    
    static {
        logger =  LogFactory.getLog(Log.class);
    }
    
    public void info(Object obj) {
        logger.info(obj);
    }
    
    public static void p(Object obj) {
        logger.info(obj);
    }
    
}
