package com.ohgiraffers.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@AllArgsConstructor //매개변수생성자
public class MemberDTO {

    private int sequence;
    private  String id;
    private  String pwd;
    private  String name;
}
