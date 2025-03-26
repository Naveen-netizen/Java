package dsa;

public class evenDigits {
    public static void main(String[] args) {
        int[] arg={1,3456,7689,3};
        int ans=findNumbers(arg);
        System.out.println(ans);
        System.out.println(digits(1234));
        
    }

    static int findNumbers( int[] nums){
        int count=0;
        for (int num :nums ) {
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    private static boolean even(int num){
        int noOfDigits=digits(num);
        return noOfDigits%2==0;
    }

    private static int digits(int num){
        double a=(double)num;
        int digits=(int)Math.log10(a)+1;
        return digits;
    }
}
