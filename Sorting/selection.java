package Sorting;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] nums = { 1, 9, 4, 7, 2 ,-1};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i-1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int index = start; index <=end; index++) {
            if (arr[max] < arr[index]) {
                max = index; 
            }
        }
        return max;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
