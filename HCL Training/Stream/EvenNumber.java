package Stream;

import java.util.*;

public class EvenNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(
                Arrays.asList(2,3,4,5,6,7)
        );

        ArrayList<Integer> evenList = new ArrayList<>();

        list.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> evenList.add(n));


        evenList.forEach(n -> System.out.println(n));
    }
}
