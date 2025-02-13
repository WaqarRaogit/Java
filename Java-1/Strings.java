import java.util.*;


public class Strings {
    

    // public static boolean isPalindrom(String str){

    //     for(int i = 0; i < str.length()/2; i++){
    //         int n = str.length();
    //         if(str.charAt(i) != str.charAt(n-1-i)){
    //             return false;
    //         }
    //     }

    //     return true;
    // }
    // public static void main(String args[]){

    //     Scanner sc = new Scanner(System.in);


    //     String str = "racecar";
    //     System.out.println(isPalindrom(str)); 
    //     // String name ;
    //     // name = sc.nextLine();
    //     // System.out.println(name);
    //     // System.out.println(name.length());
    // }

    // public static float getShortesetPath(String path){

    //     int x=0 , y = 0;
    //     for(int i = 0; i < path.length(); i++){
    //         char dir = path.charAt(i);
    //         //south
    //         if(dir == 'S'){
    //             y--;
    //         }

    //         else if(dir == 'N'){
    //             y++;
    //         }
    //         else if(dir == 'W'){
    //             x--;
    //         }
    //         else{
    //             x++;
    //         }
    //     }

    //     int X2 = x*x;
    //     int Y2 = y*y;

    //     return (float)Math.sqrt(X2 +  Y2);
    // }

    // public static void main(String args[]){

    //     String path = "WNEENESENNN";

    //     System.out.println(getShortesetPath(path));        
    // }

    // public static void main(String args[]){

    //     String fruits[] = {"zebraa", "mango", "zzanana" };

    //     String Largest  = fruits[0];

    //     for(int i = 1; i < fruits.length; i++){
    //         if(Largest.compareTo(fruits[i]) < 0){

    //             Largest  = fruits[i];
    //         }
    //     }
    //         System.out.println(Largest);
    // }

    // public static void main(String args[]){

    //     StringBuilder sb = new StringBuilder("");
    //     for(char ch = 'a'; ch <= 'z'; ch++){
    //         sb.append(ch);
    //     }

    //     System.out.println(sb.length());

    // }

//     public static String toUpperCase(String str){

//         StringBuilder sb = new StringBuilder("");
//         char ch = Character.toUpperCase(str.charAt(0));
//         sb.append(ch);

//         for(int i = 1; i  < str.length(); i++){
//             if(str.charAt(i)== ' ' && i < str.length()-1){
//                 sb.append(str.charAt(i));
//                 i++;
//             sb.append(Character.toUpperCase(str.charAt(i)));
//             }
//             else{
//                 sb.append(str.charAt(i));
//             }
//         }
//          return sb.toString();
//     }

// public static void main(String args[]){
    
//     String str = "hi, myself waqar ali";
//     System.out.println(toUpperCase(str)); 
// } 


// public static StringBuilder CompressString(String str){

//     StringBuilder newStr = new StringBuilder("");

//     for(int i =1; i < str.length(); i++){

//         Integer count = 1;

//         while(i < str.length()-1 && str.charAt(i)== str.charAt(i+1)){
//             count++;
//             i++;
//         }
//         newStr.append(str.charAt(i));
//         if(count > 1){
//             newStr.append(count.toString());
//         }
//     }

//     return newStr;
    
// }

public static void anagramCheck(){

    
    String str1 = "earth";
    String str2 = "heart";

    //convert uppercase letters into lowercase

    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();

    //check if lengths are same

    if(str1.length() == str2.length()){

        char [] str1CharArray = str1.toCharArray();
        char [] str2CharArray = str2.toCharArray();

    //Sort the Arrays

        Arrays.sort(str1CharArray);
        Arrays.sort(str2CharArray);
        
    //check if arrays are same or not                                            

    boolean result = Arrays.equals(str1CharArray, str2CharArray);

    if(result){
        System.out.println(str1 + " and " + str2 + " are anagram to each other ");
    }
    else{
        System.out.println(str1 + " and " + str2 + " are not anagram to each other ");
    }
    }
//case when lengths are not equal
    else{
            System.out.println(str1 + " and " + str2 +" are not equal ");
    }
}

public static void main(String args[]){

    //String str = "aaabbbcccdeeefghhiiiijjjkll";

    //System.out.println(CompressString(str));

        // String str ="ShradhaDidi";
        // String str1="ApnaCollege";
        // String str2="ShradhaDidi";
        // System.out.println(str.equals(str1) +" "+str.equals(str2));

        // 

            anagramCheck();
}
}


