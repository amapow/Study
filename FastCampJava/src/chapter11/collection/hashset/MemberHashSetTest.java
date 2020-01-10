package chapter11.collection.hashset;

public class MemberHashSetTest {

    public static void main(String[] args) {
        // 중복 X, 순서 X
        // equals()와 hashcode()를 재정의 해야함.
//        HashSet<String> set = new HashSet<>();
//
//        set.add("jung");
//        set.add("kim");
//        set.add("lee");
//        set.add("jung");
//
//        Iterator ir = set.iterator();
//
//        while(ir.hasNext()) {
//            System.out.println(ir.next());
//        }

        MemberHashSet manager = new MemberHashSet();

        Member lee = new Member(1, "Lee");
        Member kim = new Member(2, "kim");
        Member jung = new Member(3, "jung");
        Member hong = new Member(4, "hong");
        Member hong1 = new Member(4, "hong1");

        manager.addMember(lee);
        manager.addMember(kim);
        manager.addMember(jung);
        manager.addMember(hong);
        manager.addMember(hong1);

//        manager.showAllMember();

        manager.removeMember(3);

        manager.showAllMember();


    }
}
