
import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class ArraysCC {


//     public static int Linear_search(int nums[], int key){

//         for(int i=0; i<nums.length; i++ ){
//             if(nums[i] == key){
//                 return i;
//             }
            
//         }
//         return -1;
//     }

//     public static void main(String args[]){
    
//   int nums[]={4, 5, 6, 7, 0, 1, 2, 3};
//   int key = 0;

//   int index = Linear_search(nums, key);

//   if(index == -1){
//     System.out.println("not found");
//   }
//   else{
//     System.out.println("location is " + index);
//   }
//     }

// public static int GetLargest(int numbers[]){

// int largest = Integer.MIN_VALUE;
// int smallest = Integer.MAX_VALUE;

//     for(int i=0; i<numbers.length; i++){
//             if(largest < numbers[i]){
//                 largest = numbers[i];
//             }
//     }

//     for(int i=0; i<numbers.length; i++){
//         if(smallest > numbers[i]){
//             smallest = numbers[i];
//         }
//     }
//     System.out.println("Smallest Value is : "+ smallest);
//             return largest;

// }

// public static void main(String args[]){

//     int numbers[] = {1, 4, 26, 78, 100, 1893, 16, 19};
    
//     System.out.println("Largest in our Array : "+ GetLargest(numbers));
// }

// public static int binarySearch(int numbers[], int key){

//     int start =0 , end= numbers.length -1;

//     while(start <= end){
//         int mid = (start + end)/2;

//         if(numbers[mid] == key){
//             return mid;
//         }
//         if(numbers[mid]< key){
//             start = mid+1;
//         }
//         else{
//             end = mid -1;
//         }
        
//     }
//     return -1;
// }

// public static void main(String args[]){

//     int numbers[] = {4, 5, 6, 7};
//     int key = 5;

//     System.out.println("index of key is: " + binarySearch(numbers, key));
    
// }
// public static void reverse(int numbers[]){

//     int first = 0 , last = numbers.length-1;

//     while(first < last){
//         int temp = numbers[last];
//         numbers[last] = numbers[first];
//         numbers[first]= temp;

//         first++;
//         last--;

//     }
// }
// public static void main(String args[]){

//     int numbers[] = {2, 3, 6, 2, 89, 73, 12, 8};
     
//     reverse(numbers);
    
//     for(int i=0; i<numbers.length; i++){

//     System.out.print(numbers[i] + " ");
//     }
//     System.out.println();
// }

// public static void pairs(int numbers[]){

   
//     int n  = numbers.length;
//    int tp ;

//    tp = n * (n-1)/2;

//     //int tp = 0;
//     for(int i = 0; i < numbers.length; i++){
//         int curr = numbers[i];
//             for(int j=i+1; j < numbers.length; j++){
//                 System.out.print("(" + curr + "," + numbers[j] + ")");
//                     //tp++;
//             }
//                 System.out.println();
//     }
//                 System.out.println("total pairs "+ tp);
// }
// public static void main(String args[]){

//     int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};

//     pairs(numbers);
// }

// public static void subArrays(int numbers[]){

// int ts = 0;

//         for(int i = 0; i< numbers.length; i++){
//             int start = i;
//                 for(int j=i; j< numbers.length; j++){
//                     int end = j;
//                         for(int k=start; k<=end; k++){
//                                 System.out.print(numbers[k]+" ");
                                
//                         }
//                         ts++;
//                         System.out.println();
//                 } 
//                         System.out.println();
//         }
//                         System.out.println("total SubArrays "+ ts);
// }
// public static void main(String args[]){

//     int numbers[] = {2, 4, 6, 8, 10};

//                     subArrays(numbers);
// }


// public static void MaxsubArraysSum(int numbers[]){

//     int currSum = 0;
//     int maxSum= Integer.MIN_VALUE;

//             for(int i = 0; i< numbers.length; i++){
//                 int start = i;
//                     for(int j=i; j< numbers.length; j++){
//                         int end = j;
//                         currSum = 0;
//                             for(int k=start; k<=end; k++){
//                                    currSum += numbers[k];
                                
//                             }
                           
//                             System.out.println(currSum);
//                             if(maxSum < currSum){
//                                 maxSum = currSum;
//                             }
//                     } 
                          
//             }
//                             System.out.println("max sum is: "+ maxSum);
//     }

// public static void main(String args[]){

//     int numbers[] = {1, -2, 6, -1, 3};
//     MaxsubArraysSum(numbers);
// }
// 

// public static void maxSubArraysSum_Kadane(int numbers[]){

//     int ms = Integer.MIN_VALUE;
//     int cs = 0;
//     int smallestNegative = Integer.MIN_VALUE;
//         for(int i=0; i<numbers.length; i++){
//             cs = cs + numbers[i];
//             if(cs < 0){
//                 cs = 0;
//             }
//                 // ms = Math.max(cs, ms);

//             if(numbers[i] > smallestNegative){
//                 smallestNegative = numbers[i];
//             }
//         }
//                     //if all nums in Array are Negatiive
//             System.out.println("Our max SubArray sum with Kadane's is : " + smallestNegative);
                 
//             // System.out.println("Our max SubArray sum with Kadane's is : " + ms);
// }

// public static void main(String args[]){

//     int numbers[] = {-2, -3, -8, -7, -2, -6, -4, -3};

//     maxSubArraysSum_Kadane(numbers);
// }


}

