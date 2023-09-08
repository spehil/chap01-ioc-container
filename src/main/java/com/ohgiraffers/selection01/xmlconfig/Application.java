package com.ohgiraffers.selection01.xmlconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    //xml방식으로 설정하는 방법
     public static void main(String[] args) {

         /*GenericXmlApplicationContext 클래스를 사용하여 ApplicationContext를 생성한다.
         * 생성자는 XML 설정 메타 정보를 인자로 전달한다.*/
        ApplicationContext context
                = new GenericXmlApplicationContext("section01/xmlconfig/spring-context.xml");

        /* 1. bean의 id를 이용해서 bean을 가져오는 방법*/
         //MemberDTO member = (MemberDTO) context.getBean("member");//cast를 해줘야 MemberDTO타입으로 바뀌로 빨간줄이 없어짐
         //System.out.println(member);

         /*2. bean의 클래스 메타정보를 전달하여 가져오는 방법 */
        // MemberDTO member = context.getBean(MemberDTO.class);//클래스 메타정보를 기반으로 해당 타입의 bean을 가져온다. 타입을 명시해서 다운캐스팅 안해줘도됨 MemberDTO이크로
         //System.out.println(member);

         /*3. bean의 id와 클래스 메타 정보를 전달하여 가져오는 방법*/

         MemberDTO member = context.getBean("member", MemberDTO.class);

         System.out.println(member);
    }

}
