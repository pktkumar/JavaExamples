package lamda;


public class LamdaOne {

        public static void main(String args[]) {
            // lambda expression
            MyFunctionalInterface msg = () -> {
                return "Hello";
            };
            System.out.println(msg.sayHello());
        }


}
