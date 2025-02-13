import java.util.Arrays;
import java.util.Collections;

public class Sorting {
    
    // public static void BubbleSort(int arr[]){

    //     for(int turn=0; turn < arr.length-1; turn++){

    //         for(int j=0;  j < arr.length-1-turn; j++){
          //          if(arr[j] > arr[j+1]){
    //             int temp = arr[j];
    //             arr[j] = arr[j+1];
    //             arr[j+1] = temp;
             //       }
    //         }
    //     }

    // }
    // public static void BubbleSortPrint(int arr[]){

    //     for(int i = 0; i < arr.length; i++){
    //             System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();
    // }

    // public static void main(String args[]){

    //     int arr[] = {5, 4, 3, 2, 1};

    //         BubbleSort(arr);
    //         BubbleSortPrint(arr);
    // }

//         public static void SelectionSort(int arr[]){
//             for(int i = 0; i<arr.length-1; i++){
//                 int minPos = i;
//             for(int j=i+1; j < arr.length; j++){
//                 if(arr[minPos] > arr[j]){
//                     minPos = j;
//                 }
//             }
//                 int temp = arr[minPos]; 
//                 arr[minPos] = arr[i];
//                 arr[i] = temp;
//             }  
               
//         }

//         public static void PrintSelectionSort(int arr[]){

//             for(int i = 0; i < arr.length; i++){
//                     System.out.print(arr[i] + " ");
//             }
//             System.out.println();
//         }
// public static void main(String args[]){

//         int arr[] = {5, 4, 1, 2, 3, 8, 98, 12, 15, 90, 56, 778};

//         SelectionSort(arr);
//         PrintSelectionSort(arr);
// }

// public static void InsertionSort(int arr[]){
    
//     for(int i=1; i < arr.length; i++){
//         int curr = arr[i];
//         int prev = i-1;

// // Finding out the correct position to insert

//             while(prev >= 0 && arr[prev] > curr){
//                 arr[prev + 1] = arr[prev];
//                 prev--;
//             }
// //Insertion

//             arr[prev + 1] = curr;
//     }
// }
// public static void PrintInsertionSort(Int arr[]){

//                 for(int i = 0; i < arr.length; i++){
//                         System.out.print(arr[i] + " ");
//                 }
//                 System.out.println();
//             }
//  public static void main(String args[]){

//                 int arr[] = {5, 4, 1, 2, 3, 8, 98, 12, 15, 90, 56, 778};
//                 
//                 //InsertionSort(arr);
 //                 PrintInsertionSort(arr);
//  }

  

// Arrays.sort(arr, collection.reverseOrder()); //for this change datatype Int to Integer
//   // Arrays.sort(arr);
//   Arrays.sort(arr, 0, 4 );


// public static void countingSort(int arr[]){

//     int largest = Integer.MIN_VALUE;

//     for(int i=0; i < arr.length; i++){
//           largest = Math.max(largest, arr[i]);
//     }
//     int count [] = new int[largest + 1];

//     for(int i = 0; i<arr.length; i++){
//       count[arr[i]]++;
//     }
//       //sorting
//             int j = 0;
//       for(int i = 0; i < count.length; i++){
//           while(count[i] > 0){
//               arr[j] = i;
//               j++;
//               count[i]--;
//           }
//       }
  
// }

// public static void PrintCountingSort(int arr[]){

//                   for(int i = 0; i < arr.length; i++){
//                           System.out.print(arr[i] + " ");
//                   }
//                   System.out.println();
//               }
//     public static void main(String args[]){

//       int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};

//       countingSort(arr);
//       PrintCountingSort(arr);
//     }       

// public static void BubbleSort(int arr[]){

//       for(int turn = 0; turn < arr.length - 1; turn++){
//           for(int j=0; j < arr.length-1-turn; j++){
//             if(arr[j] > arr[j+1]){
//               int temp = arr[j];
//               arr[j] = arr[j+1];
//               arr[j+1] = temp;
//             }
//           }

//       }

// }

// public static void SelectionSort(int arr[]){
  
//       for(int i = 0; i < arr.length-1; i++){

//         int minPos = i;

//         for(int j = i+1; j < arr.length; j++){
//               if(arr[minPos] > arr[j]){
//                 minPos = j;

//               }
// //swaping
//               int temp = arr[minPos];
//               arr[minPos] = arr[i];
//               arr[i] = temp;

//         }
//       }
// }


// public static void InsertionSort(int arr[]){

//   for(int i = 1; i < arr.length; i++){

//       int curr = arr[i];
//       int prev = i-1;

//       while(prev >= 0 && arr[prev] > curr)
      
//       {    
//         arr[prev + 1] = arr[prev];
//           prev--;  
//       }

      
// //insertion
//            arr [prev + 1] = curr;

//   } 
// }




public static void printsort(int arr[]){
  for(int i = 0; i < arr.length; i++){
    System.out.print(arr[i] + " ");
  }
  System.out.println();
}


public static void main(String args[]){

    int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

    //BubbleSort(arr);
    //SelectionSort(arr);
    // InsertionSort(arr);
    printsort(arr);

}

} 

