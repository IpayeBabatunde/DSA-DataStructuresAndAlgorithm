package com.ipaye.Sorting;

public class QuickSorting {

    private static void quickSort(int[] arr, int low, int high) {
        
        if(low < high){
            
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1 );
            quickSort(arr, pi+1 ,high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j=low; j<= high; j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr [i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;

    }

    public static void main(String[] args) {

        int arr[] = {5,6,2,3,40,111,8};
        quickSort(arr, 0, arr.length-1);
        
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

   

}
