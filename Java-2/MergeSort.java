public class MergeSort {
    

    public static void PrintArr(int arr[]){

        for(int i =0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

// public static void  mergeSort(int arr[], int si, int ei){

//     if(si >= ei){
//         return;
//     }

//     int mid = si + (ei - si)/2;  // mid
//     mergeSort(arr, si, mid);  // left 
//     mergeSort(arr, mid+1, ei);  // right
   
//    merge(arr, si, mid, ei); // merge
// }

// public static void merge(int arr[], int si, int mid, int ei){

//     int temp[]= new int[ei - si + 1];
//     int i = si;
//     int j = mid + 1;
//     int k = 0;

//     while(i <= mid && j <= ei){
//         if(arr[i] < arr[j]){
//             temp[k] = arr[i];
//             i++;
//         }
//         else{
//             temp[k] = arr[j];
//             j++;
//         }
//         k++;
//     }

//     while(i <= mid){
//         temp[k++] = arr[i++];
//     }

//     while(j <= ei){
//         temp[k++] = arr[j++];
//     }
//     for(k = 0, i = si; k < temp.length; k++, i++){
//         arr[i] = temp[k];
//     }
// }

//     public static void main(String args[]){
//         int arr[] = {2, 9, 2, 5, 10, 23, 11};

//         mergeSort(arr, 0 , arr.length-1);
//         PrintArr(arr);

//     }

// public static void QuickSorting(int arr[], int si, int ei){

//     if(si >= ei){
//         return ;
//     }

//     int Pidx = Partition(arr, si, ei) ;

//     QuickSorting(arr, si, Pidx-1); //left
//     QuickSorting(arr, Pidx+1, ei); //right

// }
//    public static  int Partition (int arr[], int si, int ei){
     
//     int pivot = arr[ei];
//     int i = si-1;

//     for(int j =si; j<ei; j++){
            
//         if(arr[j] <= pivot){

//             i++;
//             int temp = arr[j];
//             arr[j] = arr[i];
//             arr[i] = temp;

//         }
//     }
//     i++;

//     int temp = pivot;
//     arr[ei] = arr[i];
//     arr[i] = temp;
//     return i;

//     }

//     public static void main(String args[]) {

//         int arr[] = {2,9,4,6,7,4,7,1,8,6};
//         QuickSorting(arr, 0, arr.length-1);
//         PrintArr(arr);
//     }
    //---------------------------------------------------------------------------------------------------
//                        SEARCH IN ROTATED SORTED ARRAY

// public static int Search(int arr[], int tar, int si, int ei ){
//     if(si > ei){
//         return -1;
//     }

//     int mid = si + (ei -si)/2; // (si + ei)/2
//     //FOUND on mid

//     if(arr[mid] == tar){
//         return mid;
//     }

//     //CASE 1: L1 
//     if(arr[si] <= arr[mid]){

//         // case a : left
//         if(arr[si] <= tar && tar <= arr[mid]){
//             return Search(arr, tar, si, mid-1);
//         }
//         // case b : right
//         return Search(arr, tar, mid+1, ei);
//     }
//             // CASE 2: L2
//     else{

//         // case c: right
//         if(arr[mid] <= tar && tar <= arr[ei]){
//             return Search(arr, tar, mid+1, ei);
//         }
//         //case d : left
//         else{
//             return Search(arr, tar, mid-1, si);
//         }
//     }
// }

// public static void main(String args[]){
//     int arr[]  = {4, 5, 6, 7, 0, 1, 2};
//     int target = 0;
//     int Tidx = Search(arr, target, 0, arr.length-1);
//     System.out.println(Tidx);
// }
// }

// public static void PrintArr(int arr[]){
//     for(int i=0; i <= arr.length; i++){
//         System.out.print(arr[i]+ " ");
//     }
// }
// public static void mergeSort(int arr[], int si, int ei){

//     if(si >= ei){
//         return;
//     }
//     int mid = si + (ei - si)/2;
//     mergeSort(arr, si, mid);
//     mergeSort(arr, mid+1, ei);

//    merge(arr , si , mid , ei);
    
// }

// public static void merge(int arr[], int si , int mid , int ei){

//     int temp[] = new int [ei - si + 1];

//     int i = si;
//     int j = mid + 1;
//     int k = 0;

//     while(i <= mid && j <= ei){
//         if(arr[i] < arr[j]){
//             temp[k] = arr[i];
//             i++;
//         }
//         else{
//             temp[k] = arr[j];
//             j++;
//         }
//         k++;
//     }

//     while( i <= mid){
//         temp[k++] = arr[i++];
//     }

//     while(j <= ei){
//         temp[k++] = arr[j++];
//     }

//     for(k= 0 , i = si; k < temp.length; k++, i++){

//                  arr[i] = temp[k];
//     }


// }

// public static void QuickSort(int arr[], int si, int ei){

//     if(si >= ei){
//         return;
//     }

//     int pidx = Partition(arr, si, ei);
//     QuickSort(arr, si, pidx-1);
//     QuickSort(arr, pidx+1, ei);
// }

// public static int Partition(int arr[] , int si , int ei){

//      int pivot = arr[ei];

//      int i = si-1;

//      for(int j = si; j < ei; j++){
//         if(arr[j] <= pivot){
//             i++;

//             int temp = arr[j];
//                 arr[j] = arr[i];
//                 arr[i] = temp;
//         }
//     }
//         i++;
//         int temp = pivot;
//         arr[ei] = arr[i];
//         arr[i] = temp;

//         return i;
//      }

public static int Search(int arr[], int tar, int si, int ei){

    if(si > ei){
        return -1;
    }
 int mid = si + (ei - si)/2;
    if(arr[mid] == tar){
        return mid;
    }
   
    if(arr[si] <= arr[mid]){
        //case a
        if(arr[si] <= tar && tar <= arr[mid])
        return Search(arr, tar, si, mid -1);
        else{
            //case b
            return Search(arr, tar, mid +1, ei);
        }
    }
    else{
        if(arr[mid] <= tar && tar <= arr[ei]){
            return Search(arr, tar, mid + 1, ei);
        }
        else{
            return Search(arr, tar, si, mid -1);
        }
    }
   
}
public static void main(String[] args) {


    int arr[] = {6, 4, 9, 3, 5, 7};
    int target = 7;
    int taridx = Search(arr, target,  0, arr.length-1);
    System.out.println(taridx);
}
}