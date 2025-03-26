package dsa;

public class wealth {
    public static void main(String[] args) {
        int[][] b = { { 110, 100, 300 ,20000000},
                { 456, 67, 50000 },
                { 100, 20, 100, 1000 } };
        int answer = richest(b);
        System.out.println("The richest person is the "+answer+" person");
    }

    static int richest(int[][] BankAccount) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int person = 0; person < BankAccount.length; person++) {
            int total = 0;
            for (int account = 0; account < BankAccount[person].length; account++) {
                total += BankAccount[person][account];
            }
            if (total > max) {
                max = total;
                index = person;
            }
        }
        return index;

    }
}
