// Exercício 8.6 - Classe SavingAccounts
//
public class SavingsAccounts {
    // variável de classe
    private static double annualInterestRate;
    // variável de instância
    private double savingsBalance;

    // método construtor
    public SavingsAccounts(double savingsBalance) {
        if (savingsBalance >= 0.0)
            this.savingsBalance = savingsBalance;
    }

    public static void modifyInterestRate(double interestRate) {
        SavingsAccounts.annualInterestRate = interestRate;
    }

    public double calculateMonthlyInterest() {
        savingsBalance += savingsBalance * (SavingsAccounts.annualInterestRate / 12);
        return savingsBalance;
    }

    public static double getAnnualInterestRate() {
        return SavingsAccounts.annualInterestRate;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
}

class SavingAccountsTest{
    public static void main(String[] args) {
        SavingsAccounts saver1 = new SavingsAccounts(2000.00);
        SavingsAccounts saver2 = new SavingsAccounts(3000.00);
        SavingsAccounts.modifyInterestRate(0.04);
        System.out.println("Account with 4% annual interest");
        System.out.println("Month   Account1   Account2");
        for (int i = 0; i < 12; i++)
            System.out.printf("%5d%11.2f%11.2f%n", i + 1, saver1.calculateMonthlyInterest(),
                                                          saver2.calculateMonthlyInterest());

        SavingsAccounts.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("%s %.3f%n","saver1 next month (13) balance (0.05 rate) =",saver1.getSavingsBalance());
        System.out.printf("%s %.3f%n","saver2 next month (13) balance (0.05 rate) =",saver2.getSavingsBalance());
    }
}
