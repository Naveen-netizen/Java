package dsa;

import java.util.Arrays;

public class twodArray {
    public static void main(String[] args) {
        int[][] array = {
                { 1, 3, 5 },
                { 2, 4, 6 },
                { 7, 8, 9}
        };
        System.out.println(Arrays.toString(search2d(array, 10)));
    }

    static int[] search2d(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[r].length - 1;
        while (r < matrix.length - 1 && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[] { r, c };
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[] { -1, -1 };
    }
}
