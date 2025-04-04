package RotatedArray;

import java.util.Arrays;

public class Rotation {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        rotation(arr, 2);
        System.out.println(Arrays.toString(arr));
    }

    public static void rotation(int[] arr, int n) {
        int length = arr.length;
        if (length == 0 || length == 1 || n % length == 0) return;
        int numberOfRotations = n % length;
        int pivot = length - numberOfRotations;
        reverse(arr, 0, pivot - 1);
        reverse(arr, pivot, length - 1);
        reverse(arr, 0, length - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
