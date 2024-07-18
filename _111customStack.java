/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

/**
 *
 * @author gayatri
 */
public class _111customStack {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public _111customStack() {
        this(DEFAULT_SIZE);
    }

    public _111customStack(int size) {
        this.data = new int[size];

    }

    private boolean isFull() {
        return ptr == data.length - 1;//means we are at last index
    }

    private boolean isEmpty() {
        return ptr == -1;//means we are at last index
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("cannot pop from an empty stack!!");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("cannot find peek from an empty stack!!");
        }
        return data[ptr];

    }

    public static void main(String[] args) {
        _111customStack stack = new _111customStack(5);
        stack.push(34);
        stack.push(45);
        stack.push(78);
        try {

            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
