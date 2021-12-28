package africa.semicolon;

public class MergeSort {

    public static void mergeSort(int[] array, int lowerBound, int upperBound) {

        if(lowerBound < upperBound){
            return;
        }

        int mid = (lowerBound + upperBound)/2;


        merge(array, mid, lowerBound, upperBound);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void merge(int[] array, int mid, int lowerBound, int upperBound){

        if(array[mid-1]<= array[mid]){
            return;
        }

        int temp = 0;
        int start = lowerBound;
        int end = upperBound;
        int midPoint = mid+1;
        int[] b = new int[end-start];

        while(start <= mid && midPoint <= upperBound){
           if(array[start] <= array[end]){
               b[temp] = array[start];
               start++;
           }else{
               b[temp] = array[end];
               end++;
           }temp++;
        }
        if (start > mid){
            while (end <= upperBound){
                b[temp] = array[end];
                end++;
                temp++;
            }
        }else{
            while(start <= mid){
                b[temp] = array[start];
                start++;
                temp++;
            }
        }
    }

}
