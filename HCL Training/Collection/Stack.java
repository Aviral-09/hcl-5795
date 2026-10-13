package Collection;

import java.util.ArrayList;

class MyStack<T> {
    private ArrayList<T> list = new ArrayList<>();

    // Add element
    public void push(T value) {
        list.add(value);
    }

    // Remove top element
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.remove(list.size() - 1);
    }

    // View top element
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.get(list.size() - 1);
    }

    // Check empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Return size
    public int size() {
        return list.size();
    }

    // Search from top (1-based position)
    public int search(T value) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (java.util.Objects.equals(list.get(i), value)) {
                return list.size() - i;
            }
        }
        return -1;
    }

    // Display stack
    public void display() {
        System.out.println("Stack (bottom to top): " + list);
    }

    // Remove all elements
    public void clear() {
        list.clear();
    }
}

public class Stack {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println("Top element: " + stack.peek());
        System.out.println("Stack size: " + stack.size());
        System.out.println("Position of 20: " + stack.search(20));

        System.out.println("Removed: " + stack.pop());

        stack.display();

        System.out.println("Is empty? " + stack.isEmpty());

        stack.clear();

        System.out.println("After clear: ");
        stack.display();
        System.out.println("Is empty? " + stack.isEmpty());
    }
}