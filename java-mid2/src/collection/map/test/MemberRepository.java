package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MemberRepository {

    Map<String, Member> memberRepository = new HashMap<>();

    public void save(Member member) {
        memberRepository.put(member.getId(), member);
    }
    public void remove(String id) {
        memberRepository.remove(id);
    }
    public Member findById(String id) {
       return memberRepository.get(id);
    }
    public Member findByName(String name) {
        Set<String> set = memberRepository.keySet();
        Member result = new Member("", "");
        for(String s : set){
            if(memberRepository.get(s).getName().equals(name)){
                result = memberRepository.get(s);
            }
        }
        return result;
    }

}
