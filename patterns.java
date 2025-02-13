public class patterns {

    public static void hollowRectangle(int row, int col){

        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){

                if(i==1 || i == row || j ==1 || j == col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    public static void inverted_half(int n){

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
            
        }

    }

    public static void inverted_half_numbers(int n){


        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }

    public static void floyds_triangle(int n){

       int count = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count + " ");
            count++;
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int n){

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j) % 2 == 0 ){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
                
            }
            System.out.println();
        }

    }

    public static void buttterfly(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");

            }
            System.out.println();
        }

        for(int i=n; i>=1; i--){
             for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");                        
            }
               System.out.println();
        }
    }

    public static void solid_rhombus(int n){

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
           for(int j=1; j<=n-i+1; j++){
            System.out.print(" ");
           }
           System.out.println();
        }
    }

    public static void hollow_rhombus(int n){
        
                for(int i=1; i<=n; i++){
            
                    for(int j=1; j<=n-i; j++){
                        System.out.print(" ");
                    }
                    for(int j=1; j<=n; j++){
                     if(i==1 || i == n || j ==1 || j == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
                System.out.println();
        }
    }
 
    public static void Diamond(int n){
        //1st half
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2 * i)-1; j++){
                System.out.print("*");
            }
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            System.out.println();
        }
//2nd half
              for(int i=n; i>=1; i--){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2 * i)-1; j++){
                System.out.print("*");
            }
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        //hollowRectangle(9, 10);
       // inverted_half(3);
        //inverted_half_numbers(10);
        //floyds_triangle(4);
        //zero_one_triangle(4);
       // buttterfly(5);
       //solid_rhombus(5);
       //hollow_rhombus(5);
       Diamond(3);

    }
    
}
