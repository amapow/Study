import java.util.NoSuchElementException;

class MakeQueue<T> {
    class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }
    private Node<T> first;
    private Node<T> last;

    public boolean isEmpry(Node<T> first) {
        if(first == null)
            return true;
        return false;
    }

    public void add (T item) {
        Node<T> t = new Node<T>(item);
        if( last != null) {
            last.next = t;
        }
        last = t;
        if( first == null) {
            first = last;
        }
    }
    public T remove() {
        if(first == null) {
            throw new NoSuchElementException();
        }
        T data = first.data;
        first = first.next;
        if(first == null) {
            last = null;
        }
        return data;
    }
    public T peek() {
        if(first == null) {
            throw new NoSuchElementException();
        }
        return first.data;
    }
}


public class queue {
    public static void main(String[] args) {
        MakeQueue<Integer> q = new MakeQueue<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

    }

}
