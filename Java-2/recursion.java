

public class recursion{

    // public static void PrintDec(int n){

    //     if(n == 1){
    //         System.out.print(1);
    //         return;
    //     }
    //     System.out.print(n+" ");
    //     PrintDec(n-1);
    // }

//     public static void PrintIncr(int n){

//         if(n == 1){
//             System.out.print(n+" ");
//             return;
//         }
//         PrintIncr(n-1);
//        System.out.println(n+" "); 
//     }
// public static void main(String args[]){

//     int n = 10;
//     PrintIncr(n);

// }

//----------------------------------------------------------------------------------------------------------

                    // Print Factorial of a Number N

//     public static int fact(int n){

//         if(n==0){
//             return 1;
//         }
//         int fnm1 = fact(n-1);

//         int fn = n * fact(n-1);      //or   int fn = n * fnm1;

//         return fn;

//     }
// public static void main(String args[]){

//     int n = 5;
//     System.out.println(fact(n));
// }
//------------------------------------------------------------------------------------------------------------


// public static int Sum(int n){

//     if(n==1){
//         return 1;
//     }
//     int Snm1 = Sum(n-1);

//     int NS = n + Sum(n-1); // or n + Snm1

//     return NS;

// }
// public static void main(String args[]){

// int n = 7;
// System.out.println(Sum(n));
// }
//--------------------------------------------------------------------------------------------------

                    // Fibonacci numbs print
// public static int fib(int n){
//     if(n==0 || n==1){
//         return n;
//     }

//    int  fibnm1 = fib(n-1);
//     int fibnm2 = fib(n-2);

//     int fibn = fibnm1 + fibnm2;
//     return fibn;
// }
// public static void main(String args[]){

//     int n = 11;
//     System.out.println(fib(n));
// }
//------------------------------------------------------------------------------------------------------
                // check if array is sorted or not

// public static boolean isSorted(int arr[], int i){

//     if(i == arr.length-1){
//             return true;
//     }

//     if(arr[i] > arr[i+1]){
//         return false;
//     }

//     return isSorted(arr, i+1);
// }

// public static void main(String args[]){

//     int arr[]={1,2,3,4,5,7};
//     System.out.println(isSorted(arr, 0));
// }
//-------------------------------------------------------------------------------------------------------------
                    //Find first occurance of an element in array

// public static int firstOccurance(int arr[], int key, int i){

//     if(i == arr.length){
//         return -1;
//     }

//     if(arr[i]== key){
//         return i;
//     }

//     return firstOccurance(arr, key, i+1);
// }

// public static void main(String args[]){

//     int arr[] = {1,3,6,7,8,1,9,6,7};
//     int key = 9;
//         System.out.println(firstOccurance(arr, key, 0));    
// }
//-----------------------------------------------------------------------------------------------------

//  public static int LastOccurance(int arr[], int key, int i){

//     if(i == arr.length){
//         return -1;
//     }
//     int isFound = LastOccurance(arr, key, i+1);
//     if(isFound == -1 && arr[i] == key){
//         return i;
//     }

//     return isFound;
// }

// public static void main(String args[]){
//     int arr[] = {7,7,7,7};

//     System.out.println(LastOccurance(arr, 7, 0));
// }

// public static int Power(int x, int n){

//     if(n == 0){
//         return 1;
//     }
//     int xnm1 = Power(x, n-1);
//     int xn = x * xnm1;
//     return xn;


//     //return x * Power(x,n-1);

// }
// public static void main(String args[]){

//     int x = 2;
//     int n = 10;
//     System.out.println(Power(x, n));
// }

//----------------------------------------------------------------------------------------------------

// public static int optimizedPower(int a, int n){
//     if(n==0){
//         return 1;
//     }

//     int halfPower = optimizedPower(a, n/2);
//     int halfPowerSq = halfPower * halfPower;

//     //n is odd
    
//     if( n % 2 != 0){
//         halfPowerSq = a * halfPowerSq;
//     }
//     return halfPowerSq;
// }

// public static void  main(String args[]){

//     int a = 2;
//     int n = 12;

//     System.out.println(optimizedPower(a, n));
// }
//--------------------------------------------------------------------------------------------------

//                               TILING PROBLEM    ==>   AMAZON

// public static int TilingProblem(int n){

//     if(n == 0 || n==1){
//         return 1;
//     }

//     //vertical

//     // int fnm1 = TilingProblem(n-1);

//     // // horizontal

//     // int fnm2 = TilingProblem(n-2);

//     // int totalWays = fnm1 + fnm2;

//     // return totalWays;
        
    
// //                  in one statement
//       return TilingProblem(n-1) + TilingProblem(n-2);
// }

// public static void main(String args[]){
//     System.out.println(TilingProblem(5));
// }

//--------------------------------------------------------------------------------------------------------
//                                      remove Duplicate Characters

// public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
//     if(idx == str.length()){
//         System.out.println(newStr);
//         return;
//     }

//     char currChar = str.charAt(idx);

//     if(map[currChar - 'a'] == true){
//         //duplicate
//         removeDuplicates(str, idx+1, newStr, map);
//     }
//     else{
//     map[currChar - 'a'] = true;
//     removeDuplicates(str, idx+1, newStr.append(currChar), map);
//     }

  
// }

// public static void main(String args[]){
//     String str = "appnacollege";
//     removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
// }
//-----------------------------------------------------------------------------------------------------------

//                                Pairing Friends

// public static int pairingFriends(int n){
//     if(n ==1 || n == 2){
//         return n;
//     }

//     //choice 
//     //single
//     int fnm1  = pairingFriends(n-1);

//    //pair
//     int fnm2 = pairingFriends(n-2);
//     int pairWays = (n-1) * fnm2;

//     int totWays = fnm1 + pairWays;

//     return totWays;
//                         code in one statement
//     return pairingFriends(n-1) + (n-1) * pairingFriends(n-2);
// }

// public static void main(String args[]){

//    System.out.println(pairingFriends(3)); 
// }
//--------------------------------------------------------------------------------------------

//                       Print Binary String

// public static void PrintBinString(int n , int lastPlace, String Str){
//     if(n == 0){
//         System.out.println(Str);
//         return;
//     }

//     PrintBinString(n-1, 0, Str+ "0");

//     if(lastPlace == 0){
//         PrintBinString(n-1, 1, Str+"1");
//     }
// }

// public static void main(String args[]){
    
//    PrintBinString(3, 0, "");
// }
//----------------------------------------------------------------------------------------------------
//                     all  occurances of given keyy in array

// public static void allOccurances(int arr[], int key, int i){
//     if(i == arr.length){
//         return;
//     }

//     if(arr[i] == key){
//         System.out.println(i+" ");
//     }

//      allOccurances(arr, key, i+1);
    
// }

// public static void main(String args[]){

//     int arr[] = {2,3,4,6,2,5,5,2};
//     int key = 2;

//     allOccurances(arr, key, 0);
// }



// static String digits[] = {"Zero" , "One" , "Two", "Three", "Four", "Five", "Six" ," Seven", "Eights", "Nine"};

//     public static void printDigits(int Number){
//     if( Number == 0){
//         return;
//     }

//     int lastDigit = Number % 10;
//     printDigits(Number / 10);

//     System.out.print(digits[lastDigit]+ " ");
// }


// public static void main(String args[]){

//      printDigits(19783);
//      System.out.println();
// }

public static int length(String str){
    if(str.length() == 0){
        return 0;
    }

    return length(str.substring(1)) + 1 ;
}
public static void main(String args[]){
    String str = "abcdef";

    System.out.println(length(str));
}
}


