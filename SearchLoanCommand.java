package Commands;

import Loan.Loan;

import java.util.List;
import java.util.Scanner;

public class SearchLoanCommand implements ICommand {
    private List<Loan> loans;

    public SearchLoanCommand(List<Loan> loans) {
        this.loans = loans;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть суму кредиту для пошуку: ");
        double amount = scanner.nextDouble();

        for (Loan loan : loans) {
            if (loan.getAmount() == amount) {
                System.out.println("Знайдено кредит: " + loan.getLoanInfo());
                return;
            }
        }

        System.out.println("Кредит не знайдений за цією сумою.");
    }
}
