public class QueueUsingLL {
    static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node front, rear;

    public QueueUsingLL() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(int key) {
        Node newNode = new Node(key);
        if (front == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public void dequeue() {
        if (front == null) {
            System.out.println("The queue is empty, try inserting elements using the enqueue");
            return;
        } else if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
        }
    }

    public int getFront() {
        return front.data;
    }

    public int getRear() {
        return rear.data;
    }

    public void display() {
        if (front == null) {
            System.out.println("The queue is empty");
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingLL queue = new QueueUsingLL();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.display();
        queue.dequeue();
        queue.display();

        System.out.println("front=" + queue.getFront());
        System.out.println("rear = " + queue.getRear());
    }
}
