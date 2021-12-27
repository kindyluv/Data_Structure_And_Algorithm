package africa.semicolon;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] array){

        for (int i = array.length-1; i >0 ; i--) {
                int largest = 0;
            for (int k =0; k<=i;k++) {
                if (array[k] > array[largest])
                    largest = k;
            }
            swap(array, largest, i);
        }
        System.out.println(Arrays.toString(array));

        for (int i: array) {
            System.out.println(i);
        }
    }

    private static void swap(int[] array, int largest, int i) {
        if (i == largest){
            return;
        }
        int temp = array[i];
        array[i] = array[largest];
        array[largest] = temp;

    }
}
