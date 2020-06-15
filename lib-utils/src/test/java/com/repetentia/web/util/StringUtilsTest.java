package com.repetentia.web.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.repetentia.support.log.TLogger;

class StringUtilsTest {
    private static TLogger logger =  TLogger.getTLogger(StringUtilsTest.class);
    @Test
    void camelToUnderscore() {
        String str = "camelToUnderscore";
        String expected = "camel_to_underscore";
        String actual = StringUtils.camelToUnderscore(str);
        logger.log(expected.equals(actual), "[result:{}][str:{}, return:{}][# public static String underscoreToCamel(final String str) #]", str, actual);
        assertEquals(expected, actual);
    }

    @Test
    void underscoreToCamel() {
        String str = "underscore_to_camel";
        String expected = "underscoreToCamel";
        String actual = StringUtils.underscoreToCamel(str);
        logger.log(expected.equals(actual), "[result:{}][str:{}, return:{}][# public static String underscoreToCamel(final String str) #]", str, actual);
        assertEquals(expected, actual);
    }
    
}
