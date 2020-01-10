package chapter11.collection;

import java.util.ArrayList;

class MyStack {

    private ArrayList<String> arrayStack = new ArrayList<>();

    public void push(String data) {
        arrayStack.add(data);
        int index = arrayStack.size() - 1;
        System.out.println("Add '" + data + "' in stack");
        System.out.println("index : " + index);
    }

    public String pop() {
        int last = arrayStack.size();
        if(last == 0) {
            return "Stack is empty!";
        }
        else {
            String popData = arrayStack.get(last-1);
            arrayStack.remove(last-1);
            return popData;
        }
    }

    public void showStackInfo() {
        System.out.println("Show stack info");
        for(int i = 0 ; i < arrayStack.size() ; i++) {
            System.out.println("index : " + i + "\n" + "data : " + arrayStack.get(i));
        }
    }
}

public class StackTest {

    public static void main(String[] args) {

        MyStack stack = new MyStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        stack.showStackInfo();

        stack.pop();
        stack.showStackInfo();
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

    }
}
