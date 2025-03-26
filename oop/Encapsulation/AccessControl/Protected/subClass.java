package Encapsulation.AccessControl.Protected;

public class subClass extends A{
    public subClass(int a, int b){
        super(a,b);
    }
    public static void main(String[] args) {
        A obj= new A (1,2);
        int n= obj.a;
        System.out.println(n);
    }

}