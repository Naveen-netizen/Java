package dsa;

import java.util.Arrays;

public class firstLast {
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        int goal=10;
        String location=Arrays.toString(searchRange(arr,goal));
        System.out.println(location);

    }

    static public int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        ans[0] = search(nums, target, true);
        if(ans[0]!=-1){
            ans[1]=search(nums, target, false);
        }
        return ans;
    }

    private static int search(int[] nums, int target, boolean findStartIndex) {
        int result = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                result = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }
        return result;

    }

}
