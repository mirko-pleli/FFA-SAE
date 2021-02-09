package sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InsertionSortTest {

     @Test
     void sort() {
         int[] arrayToSort = {3, 9, 4, 7, 6, 1, 8, 5, 2};
         int[] arraySolution = {1, 2, 3, 4, 5, 6, 7, 8, 9};

         InsertionSort insertionSort = new InsertionSort();
         insertionSort.sort(arrayToSort);

         Assertions.assertArrayEquals(arrayToSort, arraySolution);
     }
}