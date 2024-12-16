package Loan;

public class Loan {
    private double amount;
    private double interestRate;
    private String bankName;
    private int term;
    private double paidOffAmount;


    public Loan(double amount, double interestRate, String bankName, int term) {
        this.amount = amount;
        this.interestRate = interestRate;
        this.bankName = bankName;
        this.term = term;
        this.paidOffAmount = 0;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public String getBankName() {
        return bankName;
    }

    public void payOffLoan() {
        this.amount = 0;
    }

    public void printLoanDetails() {
        System.out.println("Інформація про кредит:");
        System.out.println("Банк: " + bankName);
        System.out.println("Сума кредиту: " + amount);
        System.out.println("Відсоткова ставка: " + interestRate + "%");
        System.out.println("Термін кредиту: " + term + " місяців");
        System.out.println("Виплачена сума: " + paidOffAmount);
        System.out.println("Залишок для погашення: " + (amount - paidOffAmount));
    }


    public String getLoanInfo() {
        return "Кредит в банку " + bankName + ": сума " + amount + ", відсоткова ставка " + interestRate + "%, термін " + term + " місяців.";
    }
}
