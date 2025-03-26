package Inheritance;

class Hello {
    public static void main(String[] args) {
        one obj = new one(1, 2, 3);
        int x = obj.a;
        System.out.println(x);
    }
}

class one {
    protected int a;
    int b;
    int c;

    public one(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}