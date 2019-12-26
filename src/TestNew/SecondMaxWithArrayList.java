package TestNew;

import java.util.ArrayList;

public class SecondMaxWithArrayList {

    public static void main(String arg[]){

        ArrayList<Integer> al=new ArrayList();
        al.add(4);
        al.add(5);
        al.add(55);
        al.add(3);
        al.add(22);

        int FirstMax =al.get(0);
        int getFirstMaxIndex=0;
        int i;

        for( i=0; i <al.size() ; i++){
            if( al.get(i) > FirstMax){
                FirstMax = al.get(i);
                getFirstMaxIndex = i;
            }
        }

      System.out.println("FirstMax: "+FirstMax);

        al.set(getFirstMaxIndex, 0);
        int SecMax = al.get(0);


        for(i=0 ; i <al.size() ; i++){
            if( al.get(i) > SecMax){
                SecMax = al.get(i);
            }
        }

        System.out.println("SecMax: "+SecMax);
    }


}
