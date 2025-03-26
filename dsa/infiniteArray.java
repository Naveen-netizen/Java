package dsa;

public class infiniteArray {
    public static void main(String[] args) {
        int[] arr={3,5,7,9,10,90,100,130,140,160,170};
        int targetEl=170;
        int location=ans(arr, targetEl);
        System.out.println(location);

    }
    static int ans(int[] num,int target){
        if(num.length==0){
            return -1;
        }
        int start=0;
        int end=1;
        while(num.length>end&&num[end]<target){
            int newStart=end+1;
            end=end+(end-start+1)*2;
            start=newStart;
        }
        return binarySearch(num,target,start,end);
    }
    static int binarySearch(int[] nums, int target,int start,int end) {
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
