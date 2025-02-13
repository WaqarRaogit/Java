import java.util.*;

public class JavaPrograms{
public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

  // int a = 10;
  // a /=  2;
  // System.out.println(a);
   
  // int income = sc.nextInt();


  //     if(income <= 50000){
  //       System.out.println("Tax = 0% ");
  //     }
  //     else  if(income >= 50000 && income < 100000){
  //       System.out.println("Tax = 5%");
  //     }
  //     else{
  //       System.out.println("10%");
  //     }


      // int marks = sc.nextInt();

      // if(marks >= 50){
      //   System.out.println("Student is PASS ");
      // }
      // else{
      //   System.out.println("Student is Fail ");
      // }

      // String result = marks >= 50 ? "PASS" : "FAIL";
      // System.out.println(result);

      // int a = sc.nextInt();
      // int b = sc.nextInt();
      // char operator = sc.next().charAt(0);

      // switch (operator) {
      //   case '+': System.out.println(a+b);
      //           break;
      //   case '-': System.out.println(a-b);  
      //     break;
      //   case '*': System.out.println(a*b);
      //     break;
      //     case '/': System.out.println(a/b);
      //     break;
      //   default:
      //   System.out.println("Choose on of '+, -, *, /' ");
      //     break;
      // }

      // int n = 5;
      // int sum = 0;
      // int i = 1;
      // while(i <= n){
      //   sum += i;
      //   i++;
      // }
      //    System.out.println(sum);

      // for(int i = 1 ; i <= 12; i++){
      //   System.out.println(i);
      
      //   int n = 1289392;
      //   int rev = 0;
      //   while (n > 0) {
      //     int lastDigit = n % 10;
      //     rev = (rev * 10) + lastDigit;
      //     n  = n/10;;

      //         }
      //         System.out.println(rev);
      // }

      // for(int i=1; i<=4; i++){

      //       for(int j=1; j<=i; j++){

      //         System.out.print("*");
      //       }
      //       System.out.println(" ");
      // }

      //int n = 4;
      // for(int i=1; i<=4; i++)
      // {
      //     for(int j=1; j<=n-i+1; j++){
      //       System.out.print("*");
      //     }
      //     System.out.println(" ");
      // }

      int n =4;
      char ch= 'A';
      for(int i=1; i<=n; i++){
        for(int j=1; j<=i; j++){
          System.out.print(ch);
          ch++;
        }
        System.out.println();
      }
}
}