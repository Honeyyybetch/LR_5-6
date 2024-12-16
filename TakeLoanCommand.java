package Commands;

import Loan.Loan;

import java.util.List;
import java.util.Scanner;

public class TakeLoanCommand implements ICommand {
    private List<Loan> loans;

    public TakeLoanCommand(List<Loan> loans) {
        this.loans = loans;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Оформлення нового кредиту:");

        System.out.print("Введіть суму кредиту: ");
        double amount = scanner.nextDouble();
        System.out.print("Введіть відсоткову ставку: ");
        double interestRate = scanner.nextDouble();
        System.out.print("Введіть назву банку: ");
        String bankName = scanner.next();
        System.out.print("Введіть термін кредиту (місяців): ");
        int term = scanner.nextInt();

        Loan loan = new Loan(amount, interestRate, bankName, term);
        loans.add(loan);
        System.out.println("Новий кредит оформлено: " + loan.getLoanInfo());
    }
}
