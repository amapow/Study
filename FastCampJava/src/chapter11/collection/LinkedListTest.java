package chapter11.collection;

import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");

        System.out.println(linkedList);
        linkedList.add(1, "d");
        System.out.println(linkedList);
        linkedList.removeLast();
        System.out.println(linkedList);

        for(int i = 0 ; i < linkedList.size() ; i++) {
            String s = linkedList.toString();
            System.out.println(s);
        }

    }
}
