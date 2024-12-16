import Menu.Menu;
import Commands.*;
import Loan.Loan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Loan> loans = new ArrayList<>();
        loans.add(new Loan(5000, 10.5, "ПриватБанк", 24));
        loans.add(new Loan(10000, 12.0, "МоноБанк", 36));
        loans.add(new Loan(2000, 8.0, "Ощадбанк", 12));

        Menu menu = new Menu();
        menu.addCommand(new CompareLoansCommand(loans)); // Порівняння кредитів
        menu.addCommand(new SearchLoanCommand(loans));  // Пошук кредиту за параметрами
        menu.addCommand(new DisplayAllLoansCommand(loans));  // Показати всі кредити
        menu.addCommand(new LoadUserDataCommand());  // Читати кредити з файлу
        menu.addCommand(new SaveUserDataCommand(loans));  // Записати дані користувача у файл
        menu.addCommand(new PayOffLoanCommand(loans));  // Закрити кредит
        menu.addCommand(new TakeLoanCommand(loans));  // Оформити новий кредит
        menu.addCommand(new IncreaseCreditLineCommand(loans));  // Оновити кредитну лінію
        menu.addCommand(new ExitCommand());  // Вихід з програми

        int choice = -1;
        do {
            System.out.println("\n--- Меню керування кредитами ---");
            System.out.println("1: Порівняння кредитів");
            System.out.println("2: Пошук кредиту за параметрами");
            System.out.println("3: Показати всі кредити");
            System.out.println("4: Читати кредити з файлу");
            System.out.println("5: Записати дані користувача у файл");
            System.out.println("6: Закрити кредит");
            System.out.println("7: Оформити новий кредит");
            System.out.println("8: Оновити кредитну лінію");
            System.out.println("9: Вийти з програми");

            System.out.print("Оберіть опцію: ");
            choice = scanner.nextInt();

            if (choice >= 1 && choice <= menu.getCommands().size()) {
                menu.executeCommand(choice - 1);
            } else {
                System.out.println("Невірний вибір. Спробуйте ще раз.");
            }
        } while (choice != 9);

        System.out.println("Програма завершена.");
    }
}
