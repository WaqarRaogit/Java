import java.util.*;
public class functionmethods {

//     public static int factorial(int n){
//         if(n==1){
//             System.out.println(1);
//         }
//         int f = 1;

//         for(int i=1; i<=n; i++){
//             f = f * i;
//         }
//         return f;
//     }

//     public static int bincoeff(int n, int r){

//         int fact_n = factorial(n);
//         int fact_r = factorial(r);
//         int fact_nmr = factorial(n-r);

//         int bincoeff= fact_n / (fact_r * fact_nmr);

//         return bincoeff;
//     }
//     public static void main(String args[]){

//         // factorial(10);
//         System.out.println(bincoeff(5, 2));
//     }
    
public static boolean isprime(int n){

    if(n == 2){
        return true;
    }
  
    for(int i=2; i<=Math.sqrt(n); i++){
        if(n % i == 0){
               return false;
        }
    }
    return true;
}

// public static void PrimesinRange(int n){
    
// int count = 0;
//     for(int i=2; i<=n; i++){
//       if(isprime(i)){
          
//           System.out.print(i + " ");
//           count++;
//       }
//     }
//     System.out.println();
//     System.out.println("Total Prime Numbers = " + count);
// }

// public static void binNum(int binNum){
//     int pow = 0;
//     int decNum = 0;

//     while(binNum > 0){

//         int lastDigit = binNum % 10;

//         decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

//         pow++;
//         binNum = binNum/10;
//     }
//     System.out.println(decNum);

// }

public static void decNum(int n){
    
    int pow = 0 , binNum =0;

    while(n>0){
        int rem = n % 2;

        binNum = binNum + (rem * (int)Math.pow(10 , pow));

        pow++;

        n = n/2;

    }
    System.out.println(binNum);
    

}
public static void main (String args[]){
   
decNum(78);


}

}
