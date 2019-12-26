package Test;

public class SecondMaxNumber {

    public static void main(String args[]) {

        int arr[] = {10, 324, 45, 90, 8};


        int indexNum =0;

        // Initialize maximum element
        int max = arr[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
                indexNum = i; //using this we can find next max(second max).
            }
        }

        System.out.println("First Max:-  "+max);

        arr[indexNum]=0;
        int SecMax = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > SecMax){
                SecMax= arr[i];
            }
        }
           System.out.println("SecMax:-  "+SecMax);

    }

}
