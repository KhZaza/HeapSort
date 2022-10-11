package MyHeapSort;

import java.util.Arrays;

public class myHeapSort {

    public static void main(String[] args) {
        int[] array = new int[]{16,24,15,11,17,21,14,18,19,13};
        System.out.println(Arrays.toString(array));

//        myHeapSort heapSort = new myHeapSort(array);
        buildMaxHeap(array);

        System.out.println(Arrays.toString(array));






    }



    public myHeapSort(int[]Arr){
        buildMaxHeap(Arr);
        int size = Arr.length;
        for(int i = 0 ; i < size; i++ ){
            swap(Arr,1,i);
            size --;
            heapify(Arr, 1);

        }

    }


    public static void buildMaxHeap(int Arr[]){

        for(int i = 0; i< Arr.length/2; i++ ){
            heapify(Arr, i);
        }
    }


    public static void heapify(int[]Arr, int i){
        int left = 2*i;
        int right = 2*i + 1;
        int size = Arr.length;
        int largest = i;

         if (left <= size  &&  Arr[left] > Arr[i]){
            largest = left;
        }

        if (right <= size  &&  Arr[right] > Arr[largest]){
            largest = right;
        }
        if (largest != i){
            swap(Arr, i , largest);
            heapify(Arr, largest);
        }

    }

    public static void swap(int []Arr, int a, int b){

        int temp = Arr[a];
        Arr[a] = Arr[b];
        Arr[b]= temp;
    }

}
