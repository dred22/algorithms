import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SortingAlgorithmsTest {

    int[] arrayToSort = { 6, 5, 4, 3, 2, 1};
    int iterationsNumber = 0;

    // Time complexity is O(N^2)
    @Test
    public void sortBySelection() throws Exception {
        System.out.println("SORT BY SELECTION  ###########");
        System.out.println("Array to sort array is " + Arrays.toString(arrayToSort));
        for(int i = 0; i < arrayToSort.length - 1; i++){
            var minIndex = i;
            for (int j = i + 1; j < arrayToSort.length; j++){
                iterationsNumber++;
                if(arrayToSort[j] < arrayToSort[minIndex]){
                    minIndex = j;
                }
            }

            var minElem = arrayToSort[minIndex];
            arrayToSort[minIndex] = arrayToSort[i];
            arrayToSort[i] = minElem;
        }

        System.out.println("Result array is " + Arrays.toString(arrayToSort));
        System.out.println("Number of iterations is " + iterationsNumber);
    }

    @Test
    // Time complexity is O(N^2)
    public void sortByInsert() throws Exception {
        System.out.println("SORTING BY INSERTING  ###########");
        System.out.println("Array to sort array is " + Arrays.toString(arrayToSort));

        for(int i = 1; i < arrayToSort.length ; i++){
            int element = arrayToSort[i];
            int indexToInsert = i - 1;
            while(indexToInsert >= 0 && arrayToSort[indexToInsert] > element){
                arrayToSort[indexToInsert + 1] = arrayToSort[indexToInsert];
                indexToInsert--;
                iterationsNumber++;
            }
            arrayToSort[indexToInsert + 1] = element;
        }

        System.out.println("Result array is " + Arrays.toString(arrayToSort));
        System.out.println("Number of iterations is " + iterationsNumber);
    }

    @Test
    // Time complexity is O(N^2)
    public void sortByBubble() throws Exception {
        System.out.println("BUBBLE SORTING  ###########");
        System.out.println("Array to sort array is " + Arrays.toString(arrayToSort));
        boolean isCorrected = true;
        while (isCorrected){
            isCorrected = false;
            for(int i = 0; i < arrayToSort.length - 1; i++){
                iterationsNumber++;
                if(arrayToSort[i] > arrayToSort[i+1]){
                    var elemToSwap = arrayToSort[i];
                    arrayToSort[i] = arrayToSort[i+1];
                    arrayToSort[i+1] = elemToSwap;
                    isCorrected = true;
                }
            }
        }
        System.out.println("Result array is " + Arrays.toString(arrayToSort));
        System.out.println("Number of iterations is " + iterationsNumber);
    }

    //Divide-and-conquer algorithm
    //TODO
    @Test
    public void divideAndConquer() throws Exception {
        for (int i = 0; i < 2; ++i) System.out.println(i);

    }

}
