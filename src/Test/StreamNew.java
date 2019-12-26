package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamNew {

    public static void main(String args[]) {


        // With String

        List<String> myList =
            Arrays.asList("a1", "a2", "b1", "c2", "c1");


          myList
            .stream()
            .filter(s -> s.startsWith("c"))
            .map(String::toUpperCase)
            .sorted()
            .forEach(System.out::println);

          // With Number

        ArrayList<Integer> myNumberList = new ArrayList<>();

        myNumberList.add(131);
        myNumberList.add(222);
        myNumberList.add(231);
        myNumberList.add(430);

        myNumberList
            .stream()
            .filter( i -> i>230 )
            .forEach(System.out::println);

    // Integer to int

        ArrayList<Integer> al = new ArrayList<>();
        al.add(23);
        al.add(40);
        al.add(40);

        int newSum = al.stream().mapToInt(Integer::intValue).sum();

        System.out.println("newSum  "+newSum);

    }

}
