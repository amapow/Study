package chapter6.array;

import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {

//        ArrayList<String> list = new ArrayList<String>();
        ArrayList list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        for(int i = 0; i<list.size(); i++) {
            System.out.println((String )list.get(i));
        }

        for(Object s : list) {
            System.out.println(s);
        }
    }
}
