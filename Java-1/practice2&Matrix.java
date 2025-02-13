import java.util.*;


public class practice2{


//     public static boolean isPrime(int n){

//         if(n==2){
//             return true;
//         }
//         for(int i = 2; i <= Math.sqrt(n); i++){
//             if(n % i == 0){
//                 return false;
//             }
            
//         }
//         return true;
// }



// public static void primesInRange(int n){

// for(int i=2; i<=n; i++){
//     if(isPrime(i)){

//         System.out.print(i+" ");
//     }
// }
// System.out.println();
// }

// public static void binTodec(int binNum){
//     int pow = 0;
//     int decNum = 0;
//     int myNum = binNum;

//     while(binNum>0){
//         int lastDigit = binNum % 10;
//         decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

//         pow++;

//         binNum= binNum /10;
//     }

//     System.out.println("Decimal of " + myNum + " = " + decNum);
// }

// public static void decTobin(int n){
//     int myNum = n;
//     int pow =0;
//     int binNum = 0;

//     while(n>0){

//         int rem = n % 2;

//         binNum = binNum + (rem * (int)Math.pow(10, pow));

//         pow++;

//         n = n/2;

//     }
    // System.out.println("Binary form of " + myNum + " is = "+ binNum);

//}


//Write a method named isEven that accepts an int argument.
//The method should return true if the argument is even, or false otherwise.
//Also write a program to test your method.
// public static boolean isEven(int number){
   

//     if(number % 2 == 0){
//         return true;
//     }
//     else
//     {
// return false;
//     }
    
// }
// public static void main ( String args[]){

//     Scanner sc = new Scanner(System.in);

//     int num;

//      num = sc.nextInt();
    
//      if(isEven(num)){
//         System.out.println("Number is Even");
//      }
//      else{
//         System.out.println("Number is ODD");
//      }
    
// }


// public static double average(double x, double y, double z){

//     return (x + y + z)/3;
// }
// public static void main ( String args[]){

//     Scanner sc = new Scanner(System.in);

//     System.out.println("Input first number X: ");
//     double x = sc.nextDouble();
//     System.out.println("Input Second Number Y: ");
//     double y = sc.nextDouble();
//     System.out.println("Input thirs number Z: ");
//     double z = sc.nextDouble();


//     System.out.println("Compute of three number "+ x + " " + y +" "+ z +" is = "+ average(x, y, z) + "\n" );
// }

// public static int GetLargest(int matrix[][]){

//     int largest = Integer.MIN_VALUE;
    
//     for(int i = 0; i < matrix.length; i++){
//         for(int j=0; j < matrix[0].length; j++){

//             if(largest < matrix[i][j]){
//                 largest = matrix[i][j];
//             }
//         }
//     }
//     int smallest = Integer.MAX_VALUE;
//     for(int i = 0; i < matrix.length; i++){
//         for(int j=0; j < matrix[0].length; j++){

//             if(smallest  > matrix[i][j]){
//                 smallest = matrix[i][j];
//             }
//         }
//     }
//         System.out.println(smallest);
//         return largest;
// }


// public static void main(String args[]){


//     int matrix [] [] = new int [3] [3];  

//     int n = matrix.length , m = matrix[0].length;
    
//     Scanner sc = new Scanner(System.in);
//     for(int i = 0; i < n; i++){
//         for(int j=0; j < m; j++){
//             matrix [i][j]= sc.nextInt();
//         }
//     }

//     System.out.println(GetLargest(matrix));    
//         // //output

//         // for(int i = 0; i < n; i++){
//         //     for(int j=0; j < m; j++){
//         //         System.out.print(matrix[i][j] + "  ");
//         //     }

//         //     System.out.println();
// //}      
// }

// public static void SpiralMatrix(int matrix[][]){

//     int startRow = 0;
//     int endRow   = matrix.length-1;
//     int startCol = 0;
//     int endCol = matrix[0].length-1;


//     while(startRow <= endRow && startCol <= endCol){

   
// //top
//     for(int j = startCol; j <=endCol; j++){
//         System.out.print(matrix[startRow][j]+ " ");
//     }
// //Right
//     for(int i = startRow + 1; i <= endRow; i++){
//         System.out.print(matrix[i][endCol] + " ");
//     }
// //bottom

//     for(int j = endCol-1; j >= startCol; j--){
    
//         if(startRow == endRow){
//             break;
//         }
//         System.out.print(matrix[endRow][j] + " ");
//     }
// //left

//     for(int i = endRow -1; i >= startRow + 1; i--){
        
//         if(startCol == endCol){
//             break;
//         }
//         System.out.print(matrix[i][startCol] + " ");
//     }

//     startRow++;
//     startCol++;
//     endRow--;
//     endCol--;
    

//      }
//      System.out.println();
// }

// public static void main(String args[]){


//     int matrix [] [] = {{1, 2, 3, 4},
//     {5, 6, 7, 8},
//     {9, 10, 11, 12},
//     {13, 14, 15, 16}};
    
    
    
//     SpiralMatrix(matrix);

// }



//Brute Force............
// public static int DiagonalSum(int matrix[][]){

//     int sum = 0;

//     for(int i = 0; i < matrix.length; i++){
//         for(int j = 0; j < matrix.length; j++){
//             if(i == j){
//                 sum += matrix[i][j];
//             }

//             else if(i + j == matrix.length-1){
//                 sum +=matrix[i][j];
//             }
//         }
//     }
//         return sum;

// }

// public static int DiagonalSum(int matrix[][]){
//     int sum = 0;

//     for(int i = 0; i< matrix.length; i++){
// //primary diagonal
//         sum += matrix[i][i];
// //Secendory diagonal

//         if( i != matrix.length - i -1){
//             sum += matrix[i][matrix.length - i - 1];
//         }

//     }
//     return sum;
// }

// public static void main(String args[]){


//     int matrix [] [] = {{1, 2, 3, 4},
//     {5, 6, 7, 8},
//     {9, 10, 11, 12},
//     {13, 14, 15, 16}};
    
//     System.out.println(DiagonalSum(matrix)); 
// }

//public static boolean StaircaseSearch(int matrix[][], int key){

    
//int row = 0;
//int col = matrix[0].length-1;

// while(row < matrix.length && col >= 0){

//     if(matrix[row][col] == key){
//         System.out.println("(" + row + "," + col + ")");
//         return true;
//     }
//     else if(key < matrix[row][col]){
//         col--;
//     }
//     else{
//         row++;
//     }
// }
// System.out.println("Key not Found!!");
// return false;


                                    //     int row = matrix.length-1;
                                    //     int col = 0;

                                    //     while(row < matrix.length && col >= 0){

                                    //         if(matrix[row][col] == key){
                                    //                     System.out.println("(" + row + "," + col + ")");
                                    //                     return true;
                                    //     }

                                    //     else if(key < matrix[row][col]){
                                    //         row--;
                                    //     }

                                    //     else {
                                    //         col++;
                                    //     }

                                    // }
                                    //     System.out.println("Key Not Found");
                                    //     return false;

                                    // }

// public static void main(String args[]){


//     int matrix [] [] = {{10, 20,  30, 40},
//                         {15, 25, 35, 40},
//                         {27, 29, 37, 48},
//                         {32, 33, 39, 50}};

//                         int key = 50;

//                         StaircaseSearch(matrix, key);
// }

//}



public static void printMatrix(int  matrix[][]){

    for(int i = 0; i < matrix.length; i++){
        for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j]+ " ");
        }
        System.out.println();
    }
}
public static void main(String args[]){

    int matrix [][] = {{1, 2, 3},
                       {4, 5, 6}};

     int row = 2;
     int col = 3;           

    printMatrix(matrix);

         int transpose[][] = new int [col][row];
            for(int i = 0; i < row; i++){
                for(int j = 0; j < col; j++){
                    transpose[j][i] = matrix[i][j];
                }
            }
                 printMatrix(transpose);
}
}
