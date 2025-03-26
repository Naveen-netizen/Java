public class search {
    public static void main(String[] args) {
        int[] arr = { 0,2,98,100,290 };
        int targetEl = 290;
        int location = binarySearch(arr, targetEl);
        System.out.println(location);
    }

    static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
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
        return -1;
    }
}
