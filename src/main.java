import java.util.Scanner;
public class main{
    public static void swap(int arr[], int c, int i){
        int m;
        m = arr[c];
        arr[c] = arr[i];
        arr[i] = m;
    }
    public static void divide(int arr[], int begin, int end){
        int pivot = arr[end];
        int c, i = begin;
            for(c=begin;c<=end;c++){
                if(c==end){
                    swap(arr,c,i);
                }
                else{
                    if(arr[c]<pivot){
                        swap(arr,c,i);
                        i++;
                    }
                }               
            }
        if(begin < end) {
            divide(arr, begin, i-1);
            divide(arr, i+1, end);
        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {3, 5, 2, 5, 6, 3};//new int[6];
        // for(int i = 0; i < 6; i++){
        //     arr[i] = sc.nextInt();
        // }
        divide(arr, 0, 5);
        for(int i = 0; i < 6; i++){
           System.out.print(arr[i] + " "); 
        }
    }
}