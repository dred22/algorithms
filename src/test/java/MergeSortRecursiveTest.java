import org.junit.Test;

import java.util.Arrays;

public class MergeSortRecursiveTest {
    int[] arrayToSort = {3, 2, 1, 6, 5, 5, 5, 5, 5, 4};

    // Time complexity is O(N^2)
    @Test
    public void mergeSortTest() throws Exception {
        System.out.println("SORT BY MERGING  ###########");

        mergeSort(arrayToSort, 0, arrayToSort.length - 1);

        System.out.println("Result array is " + Arrays.toString(arrayToSort));

    }

    private void mergeSort(int[] arrToSplit, int start, int end) {
        if (start >= end) {
            return;
        }
            var middle = (start + end) / 2;
            mergeSort(arrToSplit, start, middle);
            mergeSort(arrToSplit, middle + 1, end);
            merge(arrToSplit, start, middle, end);
    }

    private void merge(int[] arr, int first, int middle, int end){
        int indexLeft = first;
        int indexRight = middle + 1;

        int[] result = new int[end - first + 1];

        for(var i = 0; i < result.length; i++){
            if (indexLeft <= middle && (indexRight > end || arr[indexLeft] <= arr[indexRight])){
                result[i] = arr[indexLeft++];
            } else {
                result[i] = arr[indexRight++];
            }
        }

        var j = 0;
        for (var i = first; i <= end; i++){
            arr[i] = result[j++];
        }
    }

























    @Test
    public void mergeTwoSerted(){
        System.out.println("SORT BY MERGING  ###########");

        int[] arr1 = {1, 6, 6};
        int[] arr2 = {2, 6, 7};
        int[] result = new int[6];

        int index1 = 0;
        int index2 = 0;

        for(var indexResult = 0; indexResult < 6; indexResult++){
            if (index1 < 3 && (index2 >= 3 || arr1[index1] <= arr2[index2])){
                result[indexResult] = arr1[index1++];
            } else {
                result[indexResult] = arr2[index2++];
            }
        }
        System.out.println("result is " + Arrays.toString(result));
    }















/*    private void mergeSort2(int[] arrToSplit, int start, int end, String side) {
        if (start >= end) {
            return;
        }
        var arr = Arrays.copyOfRange(arrToSplit, start, end +1 );
        System.out.println(side + " is " + Arrays.toString(arr));
        var middle = (start + end) / 2;
        mergeSort(arrToSplit, start, middle, "left");
        mergeSort(arrToSplit, middle + 1, end, "right");
        merge(arrToSplit, start, middle, end);
        var arr2 = Arrays.copyOfRange(arrToSplit, start, end +1 );
        System.out.println(side + " after merge is " + Arrays.toString(arr2));
    }


    private void merge2(int[] arr, int first, int middle, int end){
        int[] arr1 = Arrays.copyOfRange(arr, first, middle + 1 );
        int[] arr2 = Arrays.copyOfRange(arr, middle + 1, end + 1);

        int index1 = 0;
        int index2 = 0;
        int count = arr1.length + arr2.length + first;

        for(var indexResult = first; indexResult < count; indexResult++){
            if (index1 < arr1.length && (index2 >= arr2.length || arr1[index1] <= arr2[index2])){
                arr[indexResult] = arr1[index1++];
            } else {
                arr[indexResult] = arr2[index2++];
            }
        }

    }*/

}
