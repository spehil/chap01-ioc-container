package com.ohgiraffers.section03.annotationconfig.subsection02.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context
                = new GenericXmlApplicationContext("section03/annotationconfig/spring-context.xml");

    }
}
