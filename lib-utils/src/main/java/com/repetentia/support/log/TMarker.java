package com.repetentia.support.log;

import org.slf4j.MarkerFactory;

public interface TMarker {
    org.slf4j.Marker TEST_SUCCESS = MarkerFactory.getMarker("SUCCESS");
    org.slf4j.Marker TEST_FAIL = MarkerFactory.getMarker("FAIL");
}
