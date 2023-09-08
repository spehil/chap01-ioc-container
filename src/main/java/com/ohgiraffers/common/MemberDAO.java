package com.ohgiraffers.common;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/*컴포넌트 스캔을 통해 스캐닝 되어 비능로 등록 될수 있도록 @Component 어노테이션 표기*/
@Component
public class MemberDAO {

    private final Map<Integer, MemberDTO> memberMap;

    public MemberDAO() {
        memberMap = new HashMap<>();

        memberMap.put(1, new MemberDTO(1, "user01", "pass01", "홍길동"));
        memberMap.put(2, new MemberDTO(2, "user02", "pass02", "유관순"));
    }

    /* 매개변수로 전달 받은 회원 번호를 map에서 조회 후 회원 정보를 리턴하는 메소드 */
    public MemberDTO selectMember(int sequence) {
        return memberMap.get(sequence);
    }

    /* 매개변수를 전달 받은 회원 정보를 map에 추가하고 성공 실패 여부를 boolean으로 리턴하는 메소드 */
    public boolean insertMember(MemberDTO newMember) {

        int before = memberMap.size();

        memberMap.put(newMember.getSequence(), newMember);

        int after = memberMap.size();

        return after > before ? true : false;
    }
}