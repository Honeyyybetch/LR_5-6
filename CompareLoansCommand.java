package Commands;

import Loan.Loan;

import java.util.List;

public class CompareLoansCommand implements ICommand {
    private List<Loan> loans;

    public CompareLoansCommand(List<Loan> loans) {
        this.loans = loans;
    }

    @Override
    public void execute() {
        System.out.println("Порівняння кредитів:");
        loans.sort((loan1, loan2) -> Double.compare(loan1.getInterestRate(), loan2.getInterestRate()));

        for (Loan loan : loans) {
            System.out.println(loan.getLoanInfo());
        }
    }
}
