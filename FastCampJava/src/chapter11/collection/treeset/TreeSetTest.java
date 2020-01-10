package chapter11.collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("kim");
        treeSet.add("jung");
        treeSet.add("park");

        for(String tree : treeSet) {
            System.out.println(tree);
        }

    }
}
