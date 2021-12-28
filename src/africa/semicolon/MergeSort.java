package africa.semicolon;

public class MergeSort {

    public static void mergeSort(int[] array, int lowerBound, int upperBound) {

        if(lowerBound - upperBound<2){
            return;
        }

        int mid = (lowerBound + upperBound)/2;
        mergeSort(array, lowerBound, mid);
        mergeSort(array, mid, upperBound);
        merge(array, lowerBound, mid, upperBound);


    }

    public static void merge(int[] array, int lowerBound, int mid, int upperBound) {

        if (array[mid - 1] <= array[mid]) {
            return;
        }

       int temp = 0;
        int start = lowerBound;
        int midPoint = mid;

        int[] b = new int[upperBound-lowerBound];

//        while (start <= mid && midPoint <= upperBound) {
//           if(array[start] <= array[end]){
//               b[temp] = array[start];
//               start++;
//           }else{
//               b[temp] = array[end];
//               end++;
//           }temp++;
//        }
//        if (start > mid){
//            while (end <= upperBound){
//                b[temp] = array[end];
//                end++;
//                temp++;
//            }
//        }else{
//            while(start <= mid){
//                b[temp] = array[start];
//                start++;
//                temp++;
//            }
//        }
//        }int
        while(start < mid && midPoint < upperBound){
            b[temp++] = array[start] <= array[midPoint] ? array[start++] : array[midPoint++];
        }
        System.arraycopy(array, start, array, lowerBound + temp, mid -1);
        System.arraycopy(b, 0, array, lowerBound, temp);
    }

}
