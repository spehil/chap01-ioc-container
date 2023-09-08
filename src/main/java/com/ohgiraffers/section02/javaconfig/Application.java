package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        /*AnnotationConfigApplicationContext 클래스를 사용하여 ApplicationContext를 생성한다.
        * 생상자는 @Configuration 어노테이션이 달린 설정 "클래스의 메타정보를 전달"한다.*/
        ApplicationContext context
                = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        MemberDTO member = context.getBean("member", MemberDTO.class);

        System.out.println(member);
    }
}
