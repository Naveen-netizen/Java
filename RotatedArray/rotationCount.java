package RotatedArray;

public class rotationCount {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6};
        int pivot=findingPivot(nums);
        int noOfRotations=pivot+1;
        System.out.println(noOfRotations);
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
}
