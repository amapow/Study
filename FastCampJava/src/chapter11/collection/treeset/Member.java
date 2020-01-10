package chapter11.collection.treeset;

import java.util.Comparator;

public class Member implements Comparable<Member> {

    private int memberId;
    private String memberName;

    public Member() {
    }

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return memberName + "'s ID is " + memberId;
    }

    @Override
    public int hashCode() {
        return memberId;
    }



    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) {
            Member member = (Member) obj;
            return (this.memberId == member.memberId);
        }

        return false;
    }

    // this - member가 양수이면, 즉 this가 member보다 크면 -> memberId로 오름차순 < = > 내림차순
    @Override
    public int compareTo(Member member) {
//        return (this.memberId - member.memberId);
//        return (member.memberId - this.memberId); // 내림차순
        return this.memberName.compareTo(member.getMemberName());
    }

//    @Override
//    public int compare(Member thisMember, Member member) {
//        return (thisMember.memberId - member.memberId);
//    }
}
