package chapter11.collection;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

        ArrayList<Member> arrayList = new ArrayList<>();
        ArrayList<Member> arrayList_2 = new ArrayList<>();

        Member jung = new Member(1, "jung");
        Member kim = new Member(2, "Kim");
        Member cha = new Member();
        cha.setMemberId(3);
        cha.setMemberName("cha");

        arrayList.add(jung);
        arrayList.add(kim);
        arrayList.add(cha);

        arrayList.remove(kim);

        System.out.println(arrayList);
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.addAll(arrayList_2));
    }



}
