package Test;

import java.util.ArrayList;

public class StreamTest {

    public static void main(String args[]){
        ArrayList<Integer> aList=new ArrayList<>();

        aList.add(23);
        aList.add(70);
        aList.add(4);
        aList.add(13);

        aList
            .stream()
            .filter(i -> i >20)
            .forEach(System.out::println);
    }


}
