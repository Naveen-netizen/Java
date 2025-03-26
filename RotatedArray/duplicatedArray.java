package RotatedArray;

public class duplicatedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,5,5,5,9,1,2,3};
        int targetEl = 5;
        int location=ans(nums, targetEl);
        System.out.println(location);
        System.out.println(findingPivot(nums));
    }


    static int ans(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int pivot = findingPivot(arr);
        if(pivot==-1){
            return binarySearch(arr, target, start, end);
        }
        if (target == arr[pivot]) {
            return pivot;
        } else if (target <arr[start]) {
            return binarySearch(arr, target, pivot + 1, end);
        } else {
            return binarySearch(arr, target, start, pivot - 1);
        }
    }

    static int findingPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        if(arr[start]<arr[end]){
            return -1;
        }
        else{ while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[start] ==arr[mid]&&arr[mid]==arr[end]) {
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            } else if (arr[start] < arr[mid]||((arr[start]==arr[mid])&&(arr[mid]>arr[end]))) {
                start = mid + 1;
            }
            else{
                end =mid-1;
            }
        }}
       
        return -1;
    }
    private static int binarySearch(int[] nums, int target, int start, int end) {
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
        return -1;
    }
}
