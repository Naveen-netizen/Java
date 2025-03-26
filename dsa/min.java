package dsa;

public class min {
    public static void main(String[] args) {
        int[] nums = { 1, 4, 5, -5, 2 };
        System.out.println(minimum(nums));
        System.out.println(max(nums));

    }

    static int minimum(int[] arr) {
        int minimumValue = arr[0];
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] < minimumValue) {
                minimumValue = arr[index];
            }
        }
        return minimumValue;
    }

    static int max(int[] arr) {
        int maxValue = arr[0];
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] > maxValue) {
                maxValue = arr[index];
            }
        }
        return maxValue;
    }
}
