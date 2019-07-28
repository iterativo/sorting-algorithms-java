package com.sandbox;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {4, 3, 2, 1};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
