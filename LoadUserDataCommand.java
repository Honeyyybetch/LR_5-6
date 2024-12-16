package Commands;

import java.io.*;

public class LoadUserDataCommand implements ICommand {
    private final String filePath = "C:\\Users\\Nastia\\Desktop\\2024\\2 курс\\ПП\\java_files\\logger.txt";

    @Override
    public void execute() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Завантаження даних з файлу:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Помилка під час читання файлу: " + e.getMessage());
        }
    }
}
