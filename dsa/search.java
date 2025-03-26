package dsa;

import java.util.ArrayList;

public class search {
    public static void main(String[] args) {
        int[] nums = { 100, 34, 56, 67, 89, 100 };
        int target = 100;
        ArrayList<Integer> location = linearSearch(nums, target);
        if (location.isEmpty()) {
            System.out.println("The target element "+"'"+target+"'"+" is not found in the given Array of Integrs.");
        }
        else{
            System.out.println(location);
        }
    }

    static ArrayList<Integer> linearSearch(int[] arr, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (arr.length == 0) {
            return ans;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                ans.add(index);
            }
        }
        return ans;
    }
}