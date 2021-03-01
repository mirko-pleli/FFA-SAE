package sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BubbleSortRecursiveTest {
    @Test
    void bubbleSort() {
        BubbleSortRecursive bubbleSortRecursive = new BubbleSortRecursive();
        int[] arrayToSort = {3, 9, 4, 7, 6, 1, 8, 5, 2};
        int[] arraySolution = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        bubbleSortRecursive.bubbleSort(arrayToSort, arrayToSort.length);
        Assertions.assertArrayEquals(arrayToSort, arraySolution);
    }

}