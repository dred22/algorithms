import org.junit.Test;

public class SearchingAlgorithms {


    int[] arr = { 1, 5, 14, 33, 50, 55, 70, 88, 99};
    int iterationsNumber = 0;

    @Test
    public void binarySearch() throws Exception {
        System.out.println(binarySearch(arr, 70));
        recursiveLinearPerch(arr, 55, 0);
    }

    int recursiveLinearPerch(int[] arrayToLook, int valueToSearch, int index){
        if(index >= arrayToLook.length){
            return -1;
        }
        if(arrayToLook[index] == valueToSearch){
            System.out.println("Found index is " + index);
            return index;
        } else{
            return recursiveLinearPerch(arrayToLook, valueToSearch, ++index);
        }
    }

    int binarySearch(int[] arrayToLook, int valueToSearch){
        int firstPosition = 0;
        int lastPosition = arrayToLook.length - 1;
        while (lastPosition >= firstPosition) {
            int middleIndex = (firstPosition + lastPosition) / 2;
            if(arrayToLook[middleIndex] == valueToSearch)
                return middleIndex;
            if(arrayToLook[middleIndex] > valueToSearch){
                lastPosition = middleIndex - 1;
            } else {
                firstPosition = middleIndex + 1;
            }
        }
        return -1;
    }

}
