package Commands;

import Loan.Loan;

import java.util.List;
import java.util.Scanner;

public class PayOffLoanCommand implements ICommand {
    private List<Loan> loans;

    public PayOffLoanCommand(List<Loan> loans) {
        this.loans = loans;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Виберіть кредит для закриття:");
        for (int i = 0; i < loans.size(); i++) {
            System.out.println(i + 1 + ". " + loans.get(i).getLoanInfo());
        }

        int choice = scanner.nextInt();
        if (choice > 0 && choice <= loans.size()) {
            Loan loan = loans.get(choice - 1);
            loan.payOffLoan();
        } else {
            System.out.println("Невірний вибір.");
        }
    }
}
