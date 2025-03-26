import java.util.Arrays;
import dsa.swap;

class Array {
    public static void main(String[] args) {
        int[] list = new int[5];
        list[0] = 1;
        list[1] = 2;
        list[2] = 3;
        list[3] = 4;
        list[4] = 2;
        System.out.println(Arrays.toString(list));
        swap.reverse(list);
        System.out.println(Arrays.toString(list));
    }
}

