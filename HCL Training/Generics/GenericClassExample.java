package Generics;

class Box<T> {
    T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void display() {
        System.out.println("Value: " + value);
    }
}

public class GenericClassExample {
    public static void main(String[] args) {

        Box<String> b1 = new Box<>("Hello Java");
        b1.display();

        Box<Integer> b2 = new Box<>(100);
        b2.display();

        Box<Double> b3 = new Box<>(95.5);
        b3.display();
    }
}