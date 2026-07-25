package StacksAndQueues;

public class QueueUsingArray {
    int[] queue = new int[10];
    int rear = 0;
    int front = 0;

    void push(int x) {
        if(rear >= queue.length) {
            System.out.println("Can't push, overflow..");
            return;
        }
        queue[rear++] = x;
    }

    int remove() {
        if(front == rear) {
            System.out.println("No element present, underflow..");
            return -1;
        }

        return queue[front++];
    }

    int size() {
        return rear - front;
    }

    int peek() {
        if(front == rear) {
            System.out.println("No element present, underflow..");
            return -1;
        }

        return queue[front];
    }

    boolean isEmpty() {
        return rear == front;
    }

    void print() {
        for(int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        QueueUsingArray queueUsingArray = new QueueUsingArray();
        queueUsingArray.push(1);
        queueUsingArray.print();
        queueUsingArray.push(2);
        queueUsingArray.print();
        queueUsingArray.push(3);
        queueUsingArray.print();
        System.out.println("remove() --> " + queueUsingArray.remove());
        System.out.println("peek() --> " + queueUsingArray.peek());
        System.out.println("size() --> " + queueUsingArray.size());
        System.out.println("isEmpty() --> " + queueUsingArray.isEmpty());
        queueUsingArray.push(4);
        queueUsingArray.print();
        queueUsingArray.push(5);
        queueUsingArray.print();
        System.out.println("remove() --> " + queueUsingArray.remove());
        queueUsingArray.print();
        System.out.println("peek() --> " + queueUsingArray.peek());
        System.out.println("size() --> " + queueUsingArray.size());
        System.out.println("remove() --> " + queueUsingArray.remove());
        System.out.println("remove() --> " + queueUsingArray.remove());
        System.out.println("remove() --> " + queueUsingArray.remove());
        System.out.println("remove() --> " + queueUsingArray.remove());
        System.out.println("size() --> " + queueUsingArray.size());
        System.out.println("isEmpty() --> " + queueUsingArray.isEmpty());
    }
}
