import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i = 0; i < 6; i++){
            arr[i] = sc.nextInt();
        }
        divide(arr, 0, 5);
        for(int i = 0; i < 6; i++){
           System.out.print(arr[i] + " "); 
        }
    }
    public static void swap(int a, int b){
        int m;
        m = a;
        a = b;
        b = m;
    }
    public static void divide(int arr[], int begin, int end){
        int pivot = arr[end];
        int c, i = 0;
            for(c=0;c<=end;c++){
                if(c==end){
                    swap(arr[i],arr[c]);
                }
                else{
                    if(arr[c]<pivot){
                        swap(arr[c],arr[i]);
                        i++;
                    }
                }               
            }
        int[] leftArr = new int[i];
        int[] rightArr = new int[end - i];
        int k = 0, h = i+1, q = 0;
        while(k<i+1){
            leftArr[k] = arr[k];
            k++;
        }
        while(h<=end){
            rightArr[q]= arr[h];
            q++;
            h++;
        }
        divide(leftArr, 0, k);
        divide(rightArr, 0, q);
    }
}