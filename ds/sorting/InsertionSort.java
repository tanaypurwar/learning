package ds.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String [] args){
        int [] arr ={ 56 ,3 ,4,8};
        InsertionSort.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void sort(int [] arr){

        int size = arr.length;
        int temp,j;
        for(int i=0;i<size;i++){
            temp=arr[i];
            for(j=i;j>0&&more(arr[j-1],temp);j--){
                arr[j]=arr[j-1];
            } 
            arr[j]=temp;      
        }
        //int 
    }

    public static boolean more(int val1 , int val2){
        return val1>val2;

    }
}