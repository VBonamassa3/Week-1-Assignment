public class Main {
    public static void main(String[] args) {
        Debit dbt1 = new Debit();
        Debit dbt2 = new Debit(25);
        dbt1.deposit(100);
        dbt1.withdraw(30);
        System.out.println(dbt1.toString());

        dbt2.deposit(100);
        dbt2.withdraw(25);
        System.out.println(dbt2.toString());

        Credit cred1 = new Credit(1000);
        cred1.withdraw(700);
        cred1.deposit(300);
        System.out.println(cred1.toString());

        Loan loan1 = new Loan(40000,8,5);
        System.out.println(loan1.toString());
        loan1.deposit(10000);
        System.out.println();
        System.out.println(loan1.toString());
    }
}