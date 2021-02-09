package sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

    @Test
    void sort() {
        int[] arrayToSort = {3, 9, 4, 7, 6, 1, 8, 5, 2};
        int[] arraySolution = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arrayToSort);

        Assertions.assertArrayEquals(arrayToSort, arraySolution);
    }
}