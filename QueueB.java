import java.util.ArrayDeque;
import java.util.Queue;

public class QueueB {

    public static void main(String args[]) {
        // Queue<Integer> q = new LinkedList<>();// ArrayDeqeue
        Queue<Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }

}
