package africa.semicolon;

import static africa.semicolon.BubbleSort.bubbleSort;
import static africa.semicolon.InsertionSort.insertionSort;
import static africa.semicolon.SelectionSort.selectionSort;

public class Main {

    public static void main(String[] args) {

        int[] array = {20, 35, -15, 7, 55, 1, -22};

//        bubbleSort(array);
//        selectionSort(array);
        insertionSort(array);
	// write your code here
    }


}
