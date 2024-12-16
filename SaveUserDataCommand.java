package Commands;

import java.io.*;
import Loan.Loan;
import java.util.List;

public class SaveUserDataCommand implements ICommand {
    private String filePath = "C:\\Users\\Nastia\\Desktop\\2024\\2 курс\\ПП\\java_files\\logger.txt";
    private List<Loan> loans;

    public SaveUserDataCommand(List<Loan> loans) {
        this.loans = loans;
    }

    @Override
    public void execute() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, false))) {
            if (loans != null && !loans.isEmpty()) {
                writer.write("Loans:");
                writer.newLine();
                for (Loan loan : loans) {
                    writer.write(loan.getLoanInfo());
                    writer.newLine();
                }
            } else {
                writer.write("No loans available.");
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


