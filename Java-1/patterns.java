
import java.util.*;

public class patterns {
    

//     public static void numberpyramid(int n){

//         for(int i=1; i<=n; i++){

//             //space
//             for(int j=1; j<=n-i; j++){

//                 System.out.print(" ");
//             }
// //numbers
//             for(int j=1; j<=i; j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String args[]){

//         int n = 5;
//         numberpyramid(n);
//     }

// public static void palindromicPattern(int n){

// for(int i = 1; i<=n; i++){

//     for(int j=1; j<=n-i; j++){
//         System.out.print(" ");
//     }
//     //desc
//     for(int j=i; j>=1; j--){
//         System.out.print(j);
//     }
//     //asc
//     for(int j=2; j<=i; j++){
//         System.out.print(j);
//     }
//     System.out.println();
//     }
// }
// public static void main(String args[]){
// int n = 5;
// palindromicPattern(n);
// }

// public static void hollow_rectangle(int totRows, int totcolumn){
// //outer  loop
// for(int i=1; i<=totRows; i++){
// //inner loop
//     for(int j=1; j<=totcolumn; j++){

//         if(i==1 || i==totRows || j==1 || j==totcolumn){

//             System.out.print("*");
//         }
//         else{
//             System.out.print(" ");
//         }
           
//     }
//     System.out.println();
// }
// }
// public static void main(String args[]){


//     hollow_rectangle(4, 5);
// }

// 


// public static void inverted_half_pyramid_withNumbers(int n){
//     for(int i=1; i<=n; i++){
//         for(int j=1; j<=n-i+1; j++){
//           System.out.print(j+" ");  
//         }
//         System.out.println();
//     }
// }
// public static void main(String args[]){

//     inverted_half_pyramid_withNumbers(7);
// }

// public static void zero_one_triangle(int n){
//     for(int i=1; i<=n; i++){
//         for(int j=1; j<=i; j++){

//                 if((i+j) % 2 == 0){
//                     System.out.print("1");
//                 }
//                 else
//                 {
//                     System.out.print("0");
//                 }
//         }
//         System.out.println();
//     }
// }
// public static void main(String args[]){
//     zero_one_triangle(6);
// }

// public static void floyds_triangle(int n){
//     int counter=1;
//     for(int i=1; i<=n; i++){
//         for(int j=1; j<=i; j++){
//             System.out.print(counter+ " ");
//             counter++;
//         }
//         System.out.println();
//     }
// }
// public static void main(String args[]){

//         floyds_triangle(5);
// }

// public static void butterfly_pattern(int n){
//     //first half
//     for(int i=1; i<=n; i++){
        
//         //stars
//         for(int j=1; j<=i; j++){
//             System.out.print("*");
//         }
//         //spaces
//         for(int j=1; j<=2*(n-i); j++){
//         System.out.print(" ");
//         }
//         //stars 
//         for(int j=1; j<=i; j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }

// //Second half

//     for(int i=n; i>=1; i--){
//         for(int j=1; j<=i; j++){
//             System.out.print("*");
//         }
//         //spaces
//         for(int j=1; j<=2*(n-i); j++){
//         System.out.print(" ");
//         }
//         //stars 
//         for(int j=1; j<=i; j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }
// public static void main(String args[]){
//     butterfly_pattern(10);
// }

// public static void solid_Rhombus(int n){

//     for(int i=1; i<=n; i++){

//         //spaces

//         for(int j=1; j<=(n-i); j++){
//             System.out.print(" ");
//         }
//         //stars
// for(int j=1; j<=n; j++){
//     System.out.print("*");
// }
//     System.out.println();
//     }
// }

// public static void main(String args[]){
// solid_Rhombus(5);
// }

// public static void hollow_rectangle(int n){

// for(int i =1; i<=n; i++){

//     //spaces

//     for(int j=1; j<=(n-i); j++){
//         System.out.print(" ");
//     }
//     //stars
//     for(int j=1; j<=n; j++){
//         if(i==1 || i==n || j==1 || j==n){
//             System.out.print("*");
//         }
//         else
//         {
//             System.out.print(" ");
//         }
//     }
//     System.out.println();
// }
// }

// public static void main(String args[]){

//     hollow_rectangle(5);
// }


// public static void diamond(int n){
 
//  //1st half   
//     for(int i=1; i<=n; i++){
//         //spaces

//         for(int j=1; j<=n-i; j++){
//             System.out.print(" ");
//         }
//         //stars

//         for(int j=1; j<=(2*i)-1; j++){
//         System.out.print("*");
//         }
//         System.out.println();
//     }
// //2nd half
//     for(int i=n; i>=1; i--){
// //spaces

// for(int j=1; j<=n-i; j++){
//     System.out.print(" ");
// }
// //stars

// for(int j=1; j<=(2*i)-1; j++){
// System.out.print("*");
// }
// System.out.println();


//     }
// }
// public static void main(String args[]){

//     diamond(5);
// }


}
