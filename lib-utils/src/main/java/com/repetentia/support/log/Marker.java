package com.repetentia.support.log;

import org.slf4j.MarkerFactory;

public interface Marker {
    // 설정
    org.slf4j.Marker ROOT_CONFIG = MarkerFactory.getMarker("ROOT-CONFIG");
    org.slf4j.Marker DB_CONFIG = MarkerFactory.getMarker("DB-CONFIG");
    org.slf4j.Marker SERVLET_CONFIG = MarkerFactory.getMarker("SERVLET-CONFIG");
    // VIEW 요청로깅용
    org.slf4j.Marker VIEW = MarkerFactory.getMarker("VIEW");
    // REST 요청시
    org.slf4j.Marker REST_GET = MarkerFactory.getMarker("REST-GET");
    org.slf4j.Marker REST_POST= MarkerFactory.getMarker("REST-POST");
    // 일반 웹 요청
    org.slf4j.Marker PAGE = MarkerFactory.getMarker("PAGE");
    org.slf4j.Marker POST = MarkerFactory.getMarker("POST");
}
