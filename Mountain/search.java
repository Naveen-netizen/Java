package Mountain;

public class search {
    public static void main(String[] args) {
        int[] val1 = {  };
        int val2 = 7;
        int location = searchInMountain(val1, val2);
        System.out.println(location);
    }

    static int searchInMountain(int[] arr, int num) {
        if(arr.length==0){
            return -1;
        }
        int peak = ans(arr);
        if (peak == num) {
            return peak;
        }
        int result = binarySearch(arr, num, 0, peak);
        if (result != -1) {
            return result;
        } else {
            result = binarySearch(arr, num, peak + 1, arr.length - 1);
            return result;
        }
    }

    private static int ans(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }

    private static int binarySearch(int[] nums, int target, int start, int end) {
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
