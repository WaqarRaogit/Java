public class BackTracking {
    

    // public static void ChangeArr(int arr[], int i, int val){

    //     if(i == arr.length){
    //         PrintArr(arr);
    //         return;
    //     }
    //     arr[i] = val;
    //     ChangeArr(arr, i+1, val+1);
    //     arr[i] = arr[i] -2;
    // }
    // public static void PrintArr(int arr[]){

    //     for(int i = 0; i <arr.length; i++){
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();
    // }
    // public static void main(String args[]){
    //     int arr[] = new int[5];
    //     ChangeArr(arr, 0, 1);
    //     PrintArr(arr);

    // }
    //---------------------------------------------------------------------------
    //                                              FIND SUBSETS

    // public static void findSubSets(String str, String ans, int i){

    //     //base case
    //     if(i == str.length()){
    //         if(ans.length()== 0){
    //             System.out.println("Null");
    //         }
    //         else{
    //         System.out.println(ans);
           
    //         }
    //         return; 
    //     }

    //     //yes choice
    //         findSubSets(str, ans+str.charAt(i), i+1);

    //     // no choice
    //         findSubSets(str, ans, i+1);

    // }
    // public static void main(String args[]){

    //     String str = "abcd";

    //     findSubSets(str,"", 0);
    // }

    //-----------------------------------------------------------------------------
    //                                         FIND PERMUTATION

    // public static void findPermutation(String str, String ans){

    //     //base case
    //     if(str.length() == 0)
    //     {
    //         System.out.println(ans);
    //         return;
    //     }

    //     for(int i = 0; i < str.length(); i++){ 
    //             char curr = str.charAt(i);

    //         // delete current 

    //         String Newstr = str.substring(0, i) + str.substring(i+1);
    //         findPermutation(Newstr, ans+curr);
    //     }
    // }

    // public static void main(String args[]){

    //     String str = "abc";
    //     findPermutation(str, "");
    // }
    //-------------------------------------------------------------------------------------
    //                    N * N QUEENS CHESSBOARD


//     public static boolean isSafe(char board[][], int row,  int col){

//         //vertical up

//         for(int i = row-1; i >= 0; i--){
//             if(board[i][col] == 'Q'){
//                 return false;
//             }
//         }

//         // diag left up

//         for(int i = row-1, j = col-1; i>=0 && j>=0; i-- , j--){
//             if(board[i][j] == 'Q'){
//                 return false;
//             }
//         }

//         //diag right up

//         for(int i = row-1 , j = col+1; i>=0 && j< board.length; i--, j++){
//             if(board[i][j] == 'Q'){
//                 return false;
//             }
//         }

//         return true;
//     }
//    //public static void nQueens(char board[][], int row){

//     public static boolean nQueens(char board[][], int row){
//     //base case
//     if(row ==board.length){
//        // PrintBoard(board);
//        count++;
//         //return;
//         return true;
//     }
//     //Coloumn LOOP

//         for(int j = 0; j < board.length; j++){

//             if(isSafe(board, row, j )) {

//                 board[row][j] = 'Q';
//                 //nQueens(board, row+1); //function call

//                 if(nQueens(board, row+1)){
//                     return true;
//                 }

//                 board[row] [j] = 'x'; // backtracking step
//             }
//     }

//     return false;
//    }

//  public static  void PrintBoard(char board[][]){
    
//     System.out.println("--------  Chessboard  ---------");
//         for(int i = 0; i < board.length; i++){
//             for(int j = 0; j < board.length; j++){
//                 System.out.print(board[i][j] + " ");
//             }
//             System.out.println();
//         }
//    }
   
//    static int count = 0;

//     public static void main(String args[]){
//         int n= 6;
//         char board[][] = new char[n][n];

//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < n; j++){
//                 board[i][j]  = 'x';
//             }
//         }

//         //nQueens(board, 0);

//         if(nQueens(board, 0)){
//             System.out.println("Solution is Possible ");
//             PrintBoard(board);
//         }
//         else{
//             System.out.println("Solution is not Possible ");
//         }
//         System.out.println("Total ways to Count N Queens = " + count);
//     }
//------------------------------------------------------------------------------------------------------

 //                        GRID  WAYS

//  public static int GridWays(int i, int j, int n , int m){

//     //base case
//     if(i == n-1 && j == m-1){ //condition for last cell
//         return 1;
//     }

//     else if(i == n || j ==m){ // condition for boundary

//         return 0;
//     }

//     int W1 = GridWays(i+1, j, n, m);
//     int W2 = GridWays(i, j+1, n, m);

//     return W1 + W2;
//  }

//  public static void main(String args[]){
//     int n =3;
//     int m = 3;

//     System.out.println(GridWays(0, 0, n, m));
//  }
//---------------------------------------------------------------------------------
//                                    SUDOKU SOLVER

public static boolean SudokuSolver(int sudoku[][], int  row, int col){
    if(row==9 && col == 0){
        return true;

    }

    int nextRow = row , nextCol = col + 1;
    if(col + 1 == 9){
        nextRow = row + 1;
        nextCol =  0;
    } 
if(sudoku [row][col] != 0){
    return SudokuSolver(sudoku, nextRow, nextCol);
}

for(int digit = 1; digit <=9; digit++){


if(isSafe(sudoku , row, col, digit)){
    sudoku[row][col] = digit;

    if(SudokuSolver(sudoku, nextRow, nextCol)){
        return true;
    }
    sudoku[row][col] = 0;
}
}
  
return false;
}

public static boolean isSafe(int sudoku[][], int row, int col, int digit){

    //column

    for(int i=0; i<9; i++){
        if(sudoku[i][col] == digit){
            return false;
        }
    }

    //row
    for(int j = 0; j <9; j++){
        if(sudoku[row][j]== digit){
            return false;
        }
    }

    //grid

    int sr = (row + 3)/3;
    int sc = (col + 3)/3;

    for(int i= sr; i< sr+3; i++){
        for(int j=sc; j < sc+3; j++){
            if(sudoku[i][j] == digit){
                return false;
            }
        }
    }

    return true;
}

public  static void PrintSudoku(int sudoku[][]){

    for(int i=0; i<9; i++){
        for(int j=0; j<9; j++){
            System.out.print(sudoku[i][j] + " ");
        }
        System.out.println();
    }
    
}

public static void main(String args[]){

    int sudoku[][] = {{0, 0, 8, 0, 0, 0, 0, 0, 0},
    {4, 9, 0, 1, 5, 7, 0, 0, 2},
    {0, 0, 3, 0, 0, 4, 1, 9, 0},
    {1, 8, 5, 0, 6, 0, 0, 2, 0},
    {0, 0, 0, 0, 2, 0, 0, 6, 0},
    {9, 6, 0, 4, 0, 5, 3, 0, 0},
    {0, 3, 0, 0, 7, 2, 0, 0, 4},
    {0, 4, 9, 0, 3, 0, 0, 5, 7},
    {8, 2, 7, 0, 0, 9, 0, 1, 3}};

    if(SudokuSolver(sudoku, 0, 0)){
        System.out.println("Solution exists ");
    } else{
        System.out.println("Solution dose'nt exist ");
    }

    PrintSudoku(sudoku);
}
}
