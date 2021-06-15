package Stack;

import java.util.ArrayList;

public class ArrayToStack {

    public static void main(String[] args) {

        ArrayStack arrayStack = new ArrayStack(2);

        System.out.println("size:" + arrayStack.size());

        arrayStack.push(1);

        System.out.println("size:" + arrayStack.size());

        arrayStack.push(2);

        System.out.println("size:" + arrayStack.size());

        traversalStack(arrayStack);
    }

    private static void traversalStack(ArrayStack arrayStack) {
        while (arrayStack.size() != 0) {
            System.out.println(arrayStack.pop());
        }
    }

}

class ArrayStack {

    private int topIndex = -1;
    private int array[];

    ArrayStack(int capacity) {
        this.array = new int[capacity];
    }

    public int pop() {
        if (topIndex == -1) {
            throw new IllegalStateException("the stack is empty!");
        }
        return array[topIndex --];
    }

    public void push(int val) {
        if (topIndex == array.length - 1) {
            throw new ArrayIndexOutOfBoundsException("max:" + array.length);
        }
        array[++ topIndex] = val;
    }

    public int size() {
        return topIndex + 1;
    }

}
