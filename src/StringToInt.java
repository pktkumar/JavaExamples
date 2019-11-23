public class StringToInt {

    public static void main(String args[]){

        // Way 1
        String str ="1234";

        int num=0;

        for (int i=0; i <str.length(); i++ ){

            num *= 10;
            num += str.charAt(i) - '0';

        }

      System.out.println("String in to Number: "+num);





    }


}
