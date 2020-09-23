package _09_Collection.Exercise.CircularQueue;

public class Test {
    public static void main(String[] args) {
        CircularQueue queue=new CircularQueue();
        queue.enQueue(3);
        queue.enQueue(6);
        queue.enQueue(9);
        System.out.println(queue.displayQueue());
        queue.deQueue();
        System.out.println(queue.displayQueue());
    }
}
