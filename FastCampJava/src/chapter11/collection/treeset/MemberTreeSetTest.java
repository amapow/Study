package chapter11.collection.treeset;

public class MemberTreeSetTest {

    public static void main(String[] args) {
        // 중복 X, 순서 X
        // equals()와 hashcode()를 재정의 해야함.
//        TreeSet<String> set = new TreeSet<>();
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

        MemberTreeSet manager = new MemberTreeSet();


        Member kim = new Member(2, "kim");
        Member jung = new Member(3, "jung");
        Member hong = new Member(1, "hong");
        Member lee = new Member(4, "lee");

        manager.addMember(lee);
        manager.addMember(kim);
        manager.addMember(jung);
        manager.addMember(hong);

//        manager.removeMember(3);

        manager.showAllMember();


    }
}
