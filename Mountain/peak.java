package Mountain;

public class peak {
    public static void main(String[] args) {
        int[] nums = { 10,7,6,5,4,3,2,1,0};
        int location = ans(nums);
        System.out.println(location);

    }

    static int ans(int[] arr) {
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
}
