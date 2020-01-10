package chapter11.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {

    private HashSet<Member> hashset = new HashSet<>();

    public MemberHashSet() {
        hashset = new HashSet<Member>();
    }

    public void addMember(Member member) {
        hashset.add(member);
    }

    public boolean removeMember(int memberId) {
        Iterator ir = hashset.iterator();
        while(ir.hasNext()) {
            Member member = (Member) ir.next();
            if(member.getMemberId() == memberId) {
                hashset.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "is unknown!!");
        return false;
    }

    public void showAllMember() {
        for(Member member : hashset) {
            System.out.println(member);
        }

//        Iterator<Member> ir = hashset.iterator();
//        while(ir.hasNext()) {
//            Member member = ir.next();
//            System.out.println(member);
//        }
    }
}
