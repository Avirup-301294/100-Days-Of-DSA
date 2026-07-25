package StacksAndQueues;

public class StackUsingArray {
    int[] stack = new int[10];
    int top = -1;
//    StackUsingArray(int[] stack) {
//        this.stack = stack;
//    }

    void push(int x) {
        if(top >= 10) {
            System.out.println("Can't push, overflow..");
            return;
        }
        stack[++top] = x;
    }

    int pop() {
        if(top == -1) {
            System.out.println("No element present, underflow..");
            return -1;
        }
        top--;
        return stack[top+1];
    }

    int size() {
        if(top == -1) return 0;
        return top+1;
    }

    int top() {
        if(top == -1) {
            System.out.println("No element present, underflow..");
            return -1;
        }

        return stack[top];
    }

    boolean isEmpty() {
        return top == -1;
    }

    void print() {
        for(int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        StackUsingArray stackUsingArray = new StackUsingArray();
        stackUsingArray.push(1);
        stackUsingArray.print();
        stackUsingArray.push(2);
        stackUsingArray.print();
        stackUsingArray.push(3);
        stackUsingArray.print();
        System.out.println("pop() --> " + stackUsingArray.pop());
        System.out.println("top() --> " + stackUsingArray.top());
        System.out.println("size() --> " + stackUsingArray.size());
        System.out.println("isEmpty() --> " + stackUsingArray.isEmpty());
        stackUsingArray.push(4);
        stackUsingArray.print();
        stackUsingArray.push(5);
        stackUsingArray.print();
        System.out.println("pop() --> " + stackUsingArray.pop());
        System.out.println("top() --> " + stackUsingArray.top());
        System.out.println("size() --> " + stackUsingArray.size());
        System.out.println("pop() --> " + stackUsingArray.pop());
        System.out.println("pop() --> " + stackUsingArray.pop());
        System.out.println("pop() --> " + stackUsingArray.pop());
        System.out.println("pop() --> " + stackUsingArray.pop());
        System.out.println("size() --> " + stackUsingArray.size());
        System.out.println("isEmpty() --> " + stackUsingArray.isEmpty());
    }
}
