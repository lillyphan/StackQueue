
public class StackQueue {
    private Stack<E> in;
    private Stack<E> out;

    public class StackQueue<E> {
        private Stack<E> in;
        private Stack<E> out;
        private int size = 0;

        public StackQueue() {
            in = new Stack<>();
            in = new Stack<>();
        }

        public int size() {
            return size;
        }

        public boolean isEmpty() {
            return(in.isEmpty() && out.isEmpty());
        }
        
        //E enqueue
        //E dequeue
        //E peek

        //toString

    }
}
