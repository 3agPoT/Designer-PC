package practice.userInterface;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Клас UserManagement відповідає за функціонал реєстрації та входу користувачів.
 */
public class UserManagement {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final File userFile = new File("Data/users.json");
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Реєструє нового користувача.
     */
    public static void registerUser() {
        try {
            System.out.println("Реєстрація нового користувача");

            // Введення імені користувача
            String username;
            do {
                System.out.print("Введіть ім'я користувача: ");
                username = scanner.nextLine().trim();
                if (username.isEmpty()) {
                    System.out.println("Ім'я користувача не може бути порожнім.");
                }
            } while (username.isEmpty());

            // Введення номера телефону
            String phone;
            do {
                System.out.print("Введіть номер телефону: ");
                phone = scanner.nextLine().trim();
                if (!isValidPhoneNumber(phone)) {
                    System.out.println("Неправильний номер телефону.");
                }
            } while (!isValidPhoneNumber(phone));

            // Введення електронної пошти
            String email;
            do {
                System.out.print("Введіть електронну пошту: ");
                email = scanner.nextLine().trim();
                if (!isValidEmail(email)) {
                    System.out.println("Неправильна електронна пошта.");
                }
            } while (!isValidEmail(email));

            // Введення пароля
            String password;
            do {
                System.out.print("Введіть пароль: ");
                password = scanner.nextLine().trim();
                if (password.length() < 8) {
                    System.out.println("Пароль повинен містити принаймні 8 символів.");
                } else if (!isStrongPassword(password)) {
                    System.out.println("Пароль повинен містити принаймні одну цифру, одну велику та одну малу літеру, та один спеціальний символ.");
                }
            } while (password.length() < 6 || !isStrongPassword(password));

            // Створення теки Data, якщо вона не існує
            File dataFolder = new File("Data");
            if (!dataFolder.exists()) {
                dataFolder.mkdirs();
            }

            // Створення JSON-файлу, якщо він не існує
            if (!userFile.exists()) {
                userFile.createNewFile();
                objectMapper.writeValue(userFile, new UserList());
            }

            // Отримання списку користувачів
            UserList userList = objectMapper.readValue(userFile, UserList.class);

            // Додавання нового користувача до списку
            userList.addUser(new User(username, password, email, phone));

            // Оновлення JSON-файлу зі списком користувачів
            objectMapper.writeValue(userFile, userList);
            System.out.println("Користувач " + username + " успішно зареєстрований.");
        } catch (IOException e) {
            System.out.println("Помилка реєстрації користувача: " + e.getMessage());
        }
    }

    /**
     * Аутентифікація входу користувача.
     */
    public static void login() {
        try {
            System.out.println("Вхід користувача");
            System.out.print("Введіть ім'я користувача: ");
            String username = scanner.nextLine();
            System.out.print("Введіть пароль: ");
            String password = scanner.nextLine();

            // Отримання списку користувачів
            UserList userList = objectMapper.readValue(userFile, UserList.class);

            // Перевірка наявності користувача з вказаними обліковими даними
            if (userList.authenticateUser(username, password)) {
                System.out.println("Користувач " + username + " успішно увійшов.");
                // Перехід до меню для зареєстрованих користувачів
                UserInterface userInterface = new UserInterface();
                userInterface.registeredUserMenu(username);
            } else {
                System.out.println("Спроба входу не вдалася. Перевірте свої облікові дані.");
            }
        } catch (IOException e) {
            System.out.println("Помилка входу: " + e.getMessage());
        }
    }

    // Метод для перевірки формату номера телефону
    private static boolean isValidPhoneNumber(String phone) {
        return phone.matches("\\d{10}");
    }

    // Перевірка складності пароля
    private static boolean isStrongPassword(String password) {
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!.,])(?=\\S+$).{8,}$";
        return password.matches(pattern);
    }

    // Метод для перевірки формату електронної пошти
    private static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailRegex);
    }
}
