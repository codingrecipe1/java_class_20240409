package ch14_map.ex03_member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemberRepository {
    private static Map<Long, MemberDTO> memberDTOMap = new HashMap<>();
    private static long memberId = 1L;

    public boolean save(MemberDTO memberDTO) {
        memberDTO.setId(memberId++);
        MemberDTO dto = memberDTOMap.put(memberDTO.getId(), memberDTO);
        if (dto == null) {
            return true;
        } else {
            return false;
        }
    }

    public MemberDTO login(String memberEmail, String memberPassword) {
        for (long i : memberDTOMap.keySet()) {
            if (memberEmail.equals(memberDTOMap.get(i).getMemberEmail()) &&
                    memberPassword.equals(memberDTOMap.get(i).getMemberPassword())) {
                return memberDTOMap.get(i);
            }
        }
        return null;
    }

    public Map<Long, MemberDTO> findAll() {
        return memberDTOMap;
    }

    public boolean update(String loginEmail, String mobile) {
        for (long i : memberDTOMap.keySet()) {
            if (loginEmail.equals(memberDTOMap.get(i).getMemberEmail())) {
                memberDTOMap.get(i).setMemberMobile(mobile);
                return true;
            }
        }
        return false;
    }

    public boolean delete(String loginEmail) {
        for (long i : memberDTOMap.keySet()) {
            if (loginEmail.equals(memberDTOMap.get(i).getMemberEmail())) {
                memberDTOMap.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean emailCheck(String memberEmail) {
        for (long i : memberDTOMap.keySet()) {
            if (memberEmail.equals(memberDTOMap.get(i).getMemberEmail())) {
                return false;
            }
        }
        return true;
    }
}














