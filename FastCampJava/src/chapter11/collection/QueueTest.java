package chapter11.collection;

import java.util.ArrayList;

class MyQueue {
    ArrayList<String> queueList = new ArrayList<String>();
    private String data;

    public void enqueue(String data) {
        queueList.add(data);
        displayQueue();
    }

    public String dequeue() {
        if(queueList.size() - 1 == 0) {
            return "Queue is empty!";
        }
        else {
            String out = queueList.get(0);
            queueList.remove(0);
            displayQueue();
            return "Output : " + out;
        }
    }

    public void displayQueue() {
        System.out.print("Queue : ");
        for(int i = 0 ; i < queueList.size() ; i++) {
            if(i == queueList.size()-1) {
                System.out.print(queueList.get(i) + "(" + i + ")");
            }
            else System.out.print(queueList.get(i) + "(" + i + ")" + " - ");
        }
        System.out.println();
    }

    public void showQueueInfo() {
        System.out.println("Show queue info!!");
        displayQueue();
    }
}
public class QueueTest {
    public static void main(String[] args) {

        MyQueue queue = new MyQueue();

        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.enqueue("D");

        queue.showQueueInfo();

        System.out.println(queue.dequeue());
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.print(queue.dequeue());
    }
}

