package sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeSortTest {

    @Test
    void sort() {
        int[] actual = { 5, 1, 6, 2, 3, 4 };
        int[] expected = { 1, 2, 3, 4, 5, 6 };
        MergeSort.sort(actual, actual.length);
        Assertions.assertArrayEquals(expected, actual);
    }
}