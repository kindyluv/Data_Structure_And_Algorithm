package africa.semicolon;

public class BubbleSort {
    public static int[] swap(int[] array, int i, int j){
        if (i == j){
            return array;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        return new int[]{array[i] + array[j]};
    }

    public static void bubbleSort(int[] array){

        for (int i = array.length - 1; i >= 0; i --){
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j+1);
                }
            }
        }

        for (int j : array) {
            System.out.println(j);
        }
    }
}
