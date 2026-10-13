package Collection;

import java.util.LinkedList;

public class Link {
    public static void main(String[] args) {
        LinkedList<Integer> digit = new LinkedList<>();

        for(int i =0;i<10;i++){
            digit.add(i*3);
        }
        System.out.println("Element at index 1: " + digit.get(1));

        digit.set(2, 4);
        digit.remove(5);
        int k = 12;
        int value = 25;

        int index = digit.indexOf(k);

        if (index != -1) {
            digit.add(index + 1, value);
        } else {
            System.out.println("Element k not found");
        }

        System.out.println("Updated LinkedList: " + digit);
    }
}