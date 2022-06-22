package ua.com;

//Finish implementation of queue using array
public class QueueImpl<T> {

    private final static int INITIAL_CAPACITY = 0;
    Object[] queueArr = new Object[INITIAL_CAPACITY];
    private int nElem;
    private int front;
    private int rear;
    private int capacity;
    private int count;



    public void enqueue(T data) {
        if (rear == queueArr.length - 1) {
            System.out.println("Increased internal capacity of the Queue!");
            Object[] copyQueue = new Object[queueArr.length];
            for (int i = 0; i < copyQueue.length; i++) {
                copyQueue[i] = queueArr[i];
            }
            queueArr = new Object[copyQueue.length +10];
            for (int i = 0; i < copyQueue.length; i++) {
                queueArr[i] = copyQueue[i];
            }
            rear=-1;
        }
        queueArr[++rear] = data;
        nElem++;
        System.out.println(data + " added to the queue");
    }

    public T dequeue() {

        // check for queue underflow
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            return null;
        }

        Object x = queueArr[front];

        System.out.println("Removing " + x);

        front = (front + 1) % capacity;
        count--;

        return (T) x;
    }
    public boolean isEmpty() {
        return (size() == 0);
    }
    public int size() {
        return count;
    }
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String a[]) {
        QueueImpl queue = new QueueImpl();
        queue.dequeue();
        queue.enqueue(1);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.dequeue();
        queue.enqueue(5);
        queue.dequeue();
        queue.enqueue(6);
        queue.enqueue(7);
        queue.dequeue();
        queue.enqueue(8);
        queue.enqueue(9);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}






