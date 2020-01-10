package chapter11.collection.treeset;

import java.util.TreeSet;
import java.util.Iterator;

public class MemberTreeSet {

    private TreeSet<Member> treeSet = new TreeSet<>();

    public MemberTreeSet() {
        treeSet = new TreeSet<Member>();
    }

    public void addMember(Member member) {
        treeSet.add(member);
    }

    public boolean removeMember(int memberId) {
        Iterator ir = treeSet.iterator();
        while(ir.hasNext()) {
            Member member = (Member) ir.next();
            if(member.getMemberId() == memberId) {
                treeSet.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "is unknown!!");
        return false;
    }

    public void showAllMember() {
        for(Member member : treeSet) {
            System.out.println(member);
        }

//        Iterator<Member> ir = treeSet.iterator();
//        while(ir.hasNext()) {
//            Member member = ir.next();
//            System.out.println(member);
//        }
    }
}
