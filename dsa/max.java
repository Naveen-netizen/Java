package dsa;

import java.util.Arrays;

public class max {
    public static void main(String[] args) {
        int[][] nums = {
                { 56, 91, -97 },
                { 23, 58, 16 },
                { 100, -19, 500 }
        };
        int[][] answer = maximum(nums);
        System.out.print("The mamximum value is " + answer[0][0] + " and is located at"+" ");
        System.out.println(Arrays.toString(answer[1]));
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }

    static int[][] maximum(int[][] arr) {
        int maxValue = Integer.MIN_VALUE;
        int row = -1;
        int col = -1;
        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                if (arr[rows][cols] > maxValue) {
                    maxValue = arr[rows][cols];
                    row = rows;
                    col = cols;
                }
            }
        }
        int[][] result = { { maxValue }, { row, col } };
        return result;
    }
}
