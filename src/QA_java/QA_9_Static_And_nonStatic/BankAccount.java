package QA_java.QA_9_Static_And_nonStatic;

public class BankAccount {

    double accountBalance;

  static double interestTate;

    public static double getInterestTate() {
        return interestTate;
    }

    public static void setInterestTate(double interestTate) {
        BankAccount.interestTate = interestTate;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
