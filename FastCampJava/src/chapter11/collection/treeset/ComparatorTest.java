package chapter11.collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2) * (-1);
    }
}

public class ComparatorTest {

    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>(new MyCompare());
        treeSet.add("kim");
        treeSet.add("jung");
        treeSet.add("park");

        for(String tree : treeSet) {
            System.out.println(tree);
        }

    }
}
