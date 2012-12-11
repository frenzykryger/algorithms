package com.blogspot.nikcode.sort.insertion;

public class InsertionSort {

    /**
     * Insertion sort.
     * @param arr array to sort
     */
    public static void sort(int[] arr) {
        for (int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int i = j - 1;
            for (; (i >= 0 && arr[i] > key); i--) {
                arr[i + 1] = arr[i];
            }
            arr[i + 1] = key; 
        }
    }
}
