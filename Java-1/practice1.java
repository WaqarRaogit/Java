
import java.util.*;

public class practice1{


//     public static int factorial(int n){
// int f = 1;

// for(int i = 1; i<=n; i++){
//     f = f * i;
// }
//        return f;
//     }

//     public static int bincoeff(int n, int r){

//         int fact_n = factorial(n);
//         int fact_r = factorial(r);
//         int fact_nmr = factorial(n-r);

//         int bincoeff = fact_n / (fact_r * fact_nmr);
//         System.out.println(bincoeff);

//         return bincoeff;
//     }
//     public static void main(String args[]){
//        System.out.println(bincoeff(9, 4));
//     }
public static void main(String args[]){

    Queen q = new Queen();

    q.moves();

    }


interface ChessPlayer{
void moves();

class Queen implements ChessPlayer{

public void moves(){
    System.out.println("Up, down, Left, Right, Diagonal(in all 4 dirns )");
}
}

class Rook implements ChessPlayer{
public void moves(){
    System.out.println("Up, Down, Left , Right ");
}
}

class King implements ChessPlayer{
public void moves(){
    System.out.println("Up, Down, Left, Right, Diagonal( by 1 step )");
}
}
}

            }
        
    
