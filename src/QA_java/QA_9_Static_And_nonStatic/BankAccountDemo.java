package QA_java.QA_9_Static_And_nonStatic;

public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount a = new BankAccount();
        a.setAccountBalance(150.15);

        BankAccount b = new BankAccount();
        b.setAccountBalance(380.75);

        BankAccount.setInterestTate(3.75);


        System.out.println( " First $ "+ a.getAccountBalance());
        System.out.println( " First $ "+ b.getAccountBalance());
        System.out.println( " Interes rate $ "+ BankAccount.getInterestTate());
    }
}
