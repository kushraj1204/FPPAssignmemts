package Program1;

import java.util.Arrays;

/**
 * @author kush
 */
public class IntegerQueue {
    private final int INITIAL_LENGTH = 4;
    private int[] arr;
    private int front;
    private int rear;

    public IntegerQueue() {
        this.arr = new int[INITIAL_LENGTH];
        this.front = -1;
        this.rear = 0;
    }

    public boolean isEmpty() {
        return front == rear || rear == 0;
    }

    public boolean isFull() {
        return ((rear == arr.length));
    }

    public void enqueue(int val) {
        if (isFull()) {
            resize();
        }
        arr[rear] = val;
        if (front < 0) {
            front = 0;
        }
        rear++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int deQueueElement = arr[front];
        front++;
        return deQueueElement;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    private void resize() {
        int[] intArr = new int[arr.length + 5];
        System.arraycopy(arr, 0, intArr, 0, arr.length);
        arr = intArr;
    }

    @Override
    public String toString() {
        return "IntegerQueue{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public static void main(String[] args) {
        IntegerQueue q = new IntegerQueue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(9);
        q.enqueue(10);
        System.out.println(q.peek());
        System.out.println(q.toString());
        System.out.println(q.front);
        System.out.println(q.rear);

        System.out.println("\n\n");
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());

    }


}
