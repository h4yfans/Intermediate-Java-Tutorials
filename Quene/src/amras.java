import java.util.PriorityQueue;

/**
 * Created by KAAN on 08/05/2016.
 */
public class amras {
    public static void main(String[] args){

        PriorityQueue<String> q = new PriorityQueue<String>();

        q.offer("first");
        q.offer("second");
        q.offer("third");

        System.out.printf("%s ", q);
        System.out.println();

        System.out.printf("%s ",q.peek());
        System.out.println();

        q.poll();
        System.out.printf("%s ",q);


    }
}
