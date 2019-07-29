package com.sandbox;

public class QuickSort {
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pIndex = partition(array, low, high);
            quickSort(array, low, pIndex - 1);
            quickSort(array, pIndex + 1, high);
        }
    }

    /**
     * Picks a pivot and partitions the <code>array</code>
     * into left (lower than pivot) and right (greater than pivot) segments.
     *
     * <h2>Pivot Strategy</h2>
     *
     * This method always picks the <code>high</code> param as the pivot.
     *
     * @param array
     * @param low
     * @param high
     * @return the index of the pivot
     */
    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int pIndex = low;
        for(int i = low; i <= high - 1; i++) {
            if (array[i] <= pivot) {
                swap(array, i, pIndex);
                pIndex++;
            }
        }
        swap(array, pIndex, high);
        return pIndex;
    }

    private void swap(int[] array, int i, int j) {
        int sourceValue = array[i];
        array[i] = array[j];
        array[j] = sourceValue;
    }
}
