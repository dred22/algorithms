import org.junit.Test;

import java.util.Arrays;

public class MergeSortLoopTest {
    int[] arrayToSort = {6, 5, 4, 3, 2, 1};

    @Test
    public void mergeSortTest(){
        System.out.println("SORT BY MERGING  ###########");
        int[] tmp;
        int[] currentSrc = {6, 5, 4, 3, 2};
        int[] currentDest = new int[currentSrc.length];
        int count  = currentSrc.length;

        int size = 1;
        while (size < count) {
            for (int i = 0; i < count; i += 2 * size) {
                merge(currentSrc, i, currentSrc, i + size, currentDest, i, size);
            }

            tmp = currentSrc;
            currentSrc = currentDest;
            currentDest = tmp;

            size = size * 2;

            System.out.println(Arrays.toString(currentSrc));
        }
    }

    private void merge(int[] src1, int src1Start, int[] src2, int src2Start, int[] dest,
                              int destStart, int size) {
        int index1 = src1Start;
        int index2 = src2Start;

        int src1End = Math.min(src1Start + size, src1.length);
        int src2End = Math.min(src2Start + size, src2.length);

        int iterationCount = src1End - src1Start + src2End - src2Start;

        for (int i = destStart; i < destStart + iterationCount; i++) {
            if (index1 < src1End && (index2 >= src2End || src1[index1] < src2[index2])) {
                dest[i] = src1[index1];
                index1++;
            } else {
                dest[i] = src2[index2];
                index2++;
            }
        }
    }


}
