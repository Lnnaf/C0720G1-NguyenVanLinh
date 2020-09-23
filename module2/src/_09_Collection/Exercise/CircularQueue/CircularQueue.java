package _09_Collection.Exercise.CircularQueue;
import org.w3c.dom.CDATASection;
public class CircularQueue {
        private Node front;
        private Node rear;
        private int size;
        public int size() {
            return this.size;
        }
        public void enQueue(int data) {
            Node node = new Node(data);
            if (front == null) {
                front = rear = node;
            } else {
                //        rear.link = front;
                rear.link = node;
                node.link = front;
                rear = node;
            }
            size++;
        }
        public void deQueue() {
            if (front == null) {
                throw new UnsupportedOperationException("Empty queue, cant deQueue");
            } else if (front == rear) {
                front = rear = null;
            } else {
                front = front.link;
            }
            size--;
        }
        public String displayQueue() {
            String str = "[";
            Node temp = front;
            for (int i = 0; i < size; i++) {
                if (i == size - 1) {
                    str += temp.data;
                } else {
                    str += temp.data + ", ";
                }
                temp = temp.link;
            }
            str += "]";
            return str;
        }

}
