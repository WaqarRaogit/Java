import java.util.*;

// import java.util.ArrayList;
// import java.util.Collections;

public class Arraylist{


    public static void swap(ArrayList<Integer>List, int idx1, int idx2){
        
        int temp = List.get(idx1);

        List.set(idx1, List.get(idx2));
        List.set(idx2 , temp);
    }
    public static void main(String args[]){

        ArrayList<Integer> List = new ArrayList<>();

        List.add(110);
        List.add(4);
        List.add(3);
        List.add(8);
        List.add(2);
        List.add(11);

        System.out.println(List);
        Collections.sort(List);
        System.out.println(List);
        // int idx1 = 2 ;
        // int  idx2 = 3;
        // System.out.println(List);
        // swap(List, idx1, idx2);
        // System.out.println(List);

        // List.add(2, 11);
        // System.out.println(List);
        //                             Get operation    Time Comp O(1)

        // int element = List.get(2);
        // System.out.println(element);

      //  System.out.println(List);

        // //                          Remove Operation     O(n)

        // List.remove(2);
        // System.out.println(List);
      

        //                          SET ELEMENT OPERATION    O(n)
        // List.set(1, 9);
        // System.out.println(List);
    
        //                              Contains Element -- Search

          //  System.out.println(List.contains(4));


//size of an ArrayList

// System.out.println(List.size());

//         for(int i=0; i < List.size(); i++){
//             System.out.print(List.get(i) + " ");
//         }

// System.out.println();
//         for(int i = List.size()-1; i >=  0 ; i--){
//             System.out.print(List.get(i) + " ");
//         }

        // int max = Integer.MIN_VALUE;

        // for(int i=0; i<List.size(); i++){
        //     // if(max < List.get(i)){
        //     //     max = List.get(i);
        //     // }

        //     max = Math.max(max, List.get(i));
        // }

        // System.out.println("MAXIMUM element is = " + max);
     }
}