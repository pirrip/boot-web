package com.repetentia.support.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TLogger {
    private Logger log;
    TLogger(Logger log) {
        this.log = log;
    }
    public static TLogger getTLogger(Class<?> clazz) {
        String name = clazz.getCanonicalName();
        Logger log = LoggerFactory.getLogger(name);
        return new TLogger(log);
    }
    public void log(boolean result, String format, Object... arguments) {
        if (result) {
            this.log.info(TMarker.TEST_SUCCESS, format, arguments);
        } else {
            this.log.error(TMarker.TEST_FAIL, format, arguments);
        }
    };
}
