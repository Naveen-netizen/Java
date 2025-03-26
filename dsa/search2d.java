package dsa;

import java.util.Arrays;

public class search2d {
    public static void main(String[] args) {
        int[][] nums = {
                { 1, 3, 45 },
                { 13, 45, 67, 90 },
                { 9, 68, 90 }
        };
        int target = 90;
        int[] ans = search(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int targetEl) {
        if (arr.length == 0) {
            return new int[] { -1, -1 };
        }
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == targetEl) {
                    return new int[] { row, column };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}
