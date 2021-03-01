package sorting;

public class BubbleSortRecursive {
    protected int bubbleSort(int array[], int n) {
        if (n == 1)
            return 0;
        for (int i = 0; i < n - 1; i++)
            if (array[i] > array[i + 1]) {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        return bubbleSort(array, n - 1);
    }
}
