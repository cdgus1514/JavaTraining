package Chapter11.Collection.HashMap;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

    private HashMap<Integer, Member> hashMap;


    public MemberHashMap(){
        hashMap = new HashMap<Integer, Member>();
    }

    public void addMember(Member member){
        hashMap.put(member.getMemberID(), member);
    }

    public boolean removeMember(int memberID){
        if (hashMap.containsKey(memberID)){
            hashMap.remove(memberID);
            return true;
        }
        System.out.println("회원 번호가 없습니다.");
        return false;
    }

    public void showwAllMember(){
        Iterator<Integer> ir = hashMap.keySet().iterator();
        while (ir.hasNext()){
            int key = ir.next();
            Member member = hashMap.get(key);
            System.out.println(member);
        }
        System.out.println();

        //hashMap.values().iterator();
    }

}
