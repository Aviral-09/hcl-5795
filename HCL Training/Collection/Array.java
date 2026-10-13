package Collection;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> digit = new ArrayList<>();

          for(int i =0;i<10;i++){
              digit.add(i*3);
          }
        System.out.println("Element at index 1: " + digit.get(1));

        digit.set(2, 4);
        digit.remove(4);

        System.out.println("Updated ArrayList: " + digit);
    }
}