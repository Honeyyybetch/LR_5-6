package Commands;

import Loan.Loan;

import java.util.List;

public class DisplayAllLoansCommand implements ICommand {
    private List<Loan> loans;

    public DisplayAllLoansCommand(List<Loan> loans) {
        this.loans = loans;
    }

    @Override
    public void execute() {
        System.out.println("Всі кредити:");
        for (Loan loan : loans) {
            loan.printLoanDetails();
        }
    }
}

