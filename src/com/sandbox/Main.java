package com.sandbox;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {4, 3, 2, 1};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array);
        System.out.println("MergeSort");
        System.out.println(Arrays.toString(array));

        array = new int[]{7, 10, 2, 4, 6, 8};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(array);
        System.out.println("QuickSort");
        System.out.println(Arrays.toString(array));
    }
}
