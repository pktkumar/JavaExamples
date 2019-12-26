package Examples;

public class StringToIntUsingForEach {

    public static void  main(){
    String str2 ="1234";

    int numb=0;

        for (char eachChar : str2.toCharArray()){
         numb *= 10;
         numb += eachChar - '0';
        }

        System.out.println("String in to Number: "+numb);
    }

}
