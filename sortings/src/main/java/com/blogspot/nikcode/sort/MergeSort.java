package com.blogspot.nikcode.sort;

import java.util.Arrays;

public class MergeSort {
    
    private MergeSort() {}

    public static int[] sort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int middlePos = arr.length / 2;
        return merge(sort(Arrays.copyOfRange(arr, 0, middlePos)), sort(Arrays.copyOfRange(arr, middlePos, arr.length)));
    }
    
    private static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length  + arr2.length];
        int idx1 = 0, idx2 = 0;
        for (int i = 0; i < result.length; i++) {
            if (idx1 < arr1.length && idx2 < arr2.length) {
                if (arr1[idx1] < arr2[idx2]) {
                    result[i] = arr1[idx1++];
                } else {
                    result[i] = arr2[idx2++];
                }
            } else if (idx1 < arr1.length) {
                while (idx1 < arr1.length) {
                    result[i++] = arr1[idx1++];
                }
            } else if (idx2 < arr2.length) {
                while (idx2 < arr2.length) {
                    result[i++] = arr2[idx2++];
                }
            }
        }
        return result;
    }
}
