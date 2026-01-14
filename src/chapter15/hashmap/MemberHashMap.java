package chapter15.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



  /*  private HashMap<Integer, Member> hashMap;

    // 생성자: HashMap 참조 메모리 확보
    public MemberHashMap() {
        hashMap = new HashMap<>();
    }

    //addMember
    public void addMember(Member member) {
        int key = member.memberId();
        hashMap.put(key, member); // 
    }
    //showAllMember
    public void showAllMember() {
        Iterator<Integer> ir=hashMap.keySet().iterator();
        
        while(ir.hasNext()) {
        int key	=ir.next();
        Member member =hashMap.get(key);
        System.out.println(member);
        	
        }
    }

 

    //removeMember
    public void removeMember(int memberId) {
        if (hashMap.containsKey(memberId)) {
            hashMap.remove(memberId);
        } else {
            System.out.println(memberId + "에 해당하는 회원이 없습니다.");
        }
    }
}
*/
public class MemberHashMap {
private HashMap<Integer, String> hashMap;

public MemberHashMap() {
	hashMap = new HashMap<Integer, String>();
}

public void addMember(Member member) {
	hashMap.put(member.memberId(), member.memberName());
}

public void removeMember(int key) {
	if (hashMap.containsKey(key)) {
		hashMap.remove(key);
		System.out.println(key + " - 해당하는 아이디가 삭제되었습니다.");
	} else {
		System.out.println("해당하는 아이디가 없습니다."); 
	}
	
}

public void showAllMember() {
	for (Integer hashmap:hashMap.keySet()) {
		System.out.println(hashmap + " : " + hashMap.get(hashmap));
	}
}
}
