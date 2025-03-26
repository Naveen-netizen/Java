package dsa;

public class ceiling {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6,8};
        int number = 7;
        int location = ceilingOfTheNumber(arr, number);
        if (location == -1) {
            System.out.println(
                    "All the elements in the array are smaller than the given number. So there is no ceiling for the given number found in this array");
        } else {
            System.out.println(location);
        }
    }

    static int ceilingOfTheNumber(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        if (nums[end] < target) {
            return -1;
        }
        if (nums[start] < nums[end]) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] < target) {
                    start = mid + 1;
                } else if (nums[mid] > target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        } else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] < target) {
                    end = mid - 1;
                } else if (nums[mid] > target) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return start;
    }
}
