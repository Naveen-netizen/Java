package dsa;

public class floor {
    public static void main(String[] args) {
        int[] arr = { 12, 13, 14, 15, 17, 18 };
        int number = 16;
        int location = floorOfTheNumber(arr, number);
        System.out.println(location);
    }

    static int floorOfTheNumber(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        if(nums[end]<target){
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
        return end;
    }
}
