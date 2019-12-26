package Examples;

public class ForEachExample {

    public static void main(String[] args) {

        int arr[]={12,13,14,44};
        //traversing the array with for-each loop
        for(int i:arr){
            if(i>20)
            System.out.println(i);
        }
    }


}
