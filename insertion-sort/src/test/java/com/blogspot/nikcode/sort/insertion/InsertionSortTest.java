package com.blogspot.nikcode.sort.insertion;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author nik
 */
public class InsertionSortTest {

    @Test
    public void testInsertionSort() {
        int[] arr = new int[] { 5, 7, 7, 3, 9, 1 };
        InsertionSort.sort(arr);
        Assert.assertArrayEquals(new int[] { 1, 3, 5, 7, 7, 9 }, arr);
    }
}
