package Commands;

import Loan.Loan;
import java.util.List;
import java.util.Scanner;

public class IncreaseCreditLineCommand implements ICommand {
    private List<Loan> loans;

    public IncreaseCreditLineCommand(List<Loan> loans) {
        this.loans = loans;
    }

    @Override
    public void execute() {
        System.out.println("Список доступних кредитів:");
        for (int i = 0; i < loans.size(); i++) {
            Loan loan = loans.get(i);
            System.out.println((i + 1) +". " + loan.getBankName() + " | Сума: " + loan.getAmount() + " | Відсоткова ставка: " + loan.getInterestRate() + "%");
        }

        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice < 0 || choice >= loans.size()) {
            System.out.print("Виберіть номер кредиту, для якого хочете збільшити лінію: ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice < 0 || choice >= loans.size()) {
                    System.out.println("Невірний вибір кредиту. Спробуйте ще раз.");
                }
            } else {
                System.out.println("Будь ласка, введіть правильний номер.");
                scanner.next();
            }
        }

        Loan selectedLoan = loans.get(choice);

        double increaseAmount = -1;
        while (increaseAmount <= 0) {
            System.out.print("Введіть суму для збільшення кредитної лінії: ");
            if (scanner.hasNextDouble()) {
                increaseAmount = scanner.nextDouble();
                if (increaseAmount <= 0) {
                    System.out.println("Сума збільшення повинна бути більшою за нуль.");
                }
            } else {
                System.out.println("Будь ласка, введіть правильну суму.");
                scanner.next();
            }
        }

        selectedLoan.setAmount(selectedLoan.getAmount() + increaseAmount);
        System.out.println("Кредитна лінія для кредиту з банку " + selectedLoan.getBankName() + " була збільшена на " + increaseAmount + ". Новий ліміт: " + selectedLoan.getAmount());
    }
}
