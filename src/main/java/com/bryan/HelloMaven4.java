package com.bryan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloMaven4 {
    public static Logger log = LoggerFactory.getLogger(HelloMaven4.class);

    public static void main(String[] args) {
        System.out.println("hello maven");
        log.info("hello info");
        log.debug("hello debug");
    }
}
