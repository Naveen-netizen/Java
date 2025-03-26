package dsa;

public class swap {
    
        int[] a;
    
        public static void swaping(int[] a, int index1, int index2) {
            int temp = a[index1];
            a[index1] = a[index2];
            a[index2] = temp;
        }
    
        public static void reverse(int[] a) {
            int Start = 0;
            int End = a.length - 1;
            while (Start < End) {
                swaping(a, Start, End);
                Start++;
                End--;
            }
        }
    
}
