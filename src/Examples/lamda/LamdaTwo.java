package Examples.lamda;

public class LamdaTwo {


    public static void main(String arg[]) {

    InterfaceTwo newadd = (x, y) -> x + y;
    System.out.println(newadd.adding(4,5));

    InterfaceTwo newSub = (x,y) -> x-y;
    System.out.println(newSub.adding(7,40));


    }
}
