package PACKAGE_NAME;

public class StackQueue<E> {
    private Stack<E> in;
    private Stack<E> out;
    private int size = 0;

    public StackQueue() {
        in = new Stack<>();
        out = new Stack<>();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (in.isEmpty() && out.isEmpty());
    }

    //E enqueue
    public E dequeue() {
        return null;
    }
}

