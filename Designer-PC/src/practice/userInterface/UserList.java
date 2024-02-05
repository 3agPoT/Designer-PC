package practice.userInterface;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Клас UserList представляє список користувачів у системі.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
class UserList {
    private List<User> users;
    private int userCount;

    /**
     * Конструктор створює новий об'єкт UserList.
     */
    public UserList() {
        users = new ArrayList<>();
        userCount = 0;
    }

    /**
     * Отримує список користувачів.
     *
     * @return список користувачів
     */
    public List<User> getUsers() {
        return users;
    }

    /**
     * Встановлює список користувачів.
     *
     * @param users список користувачів
     */
    public void setUsers(List<User> users) {
        this.users = users;
    }

    /**
     * Додає користувача до списку.
     *
     * @param user користувач для додавання
     */
    public void addUser(User user) {
        user.setId(generateUniqueId());
        users.add(user);
        userCount++;
    }

    /**
     * Генерує унікальний ідентифікатор для кожного користувача.
     *
     * @return унікальний ідентифікатор
     */
    private String generateUniqueId() {
        return UUID.randomUUID().toString();
    }

    /**
     * Отримує користувача за індексом.
     *
     * @param index індекс користувача
     * @return користувач за вказаним індексом, або null, якщо індекс виходить за межі
     */
    public User getUserByIndex(int index) {
        if (index >= 0 && index < users.size()) {
            return users.get(index);
        }
        return null;
    }

    /**
     * Аутентифікує користувача з вказаним ім'ям користувача та паролем.
     *
     * @param username ім'я користувача для аутентифікації
     * @param password пароль користувача для аутентифікації
     * @return true, якщо аутентифікація успішна, false в іншому випадку
     */
    public boolean authenticateUser(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Перевіряє, чи ім'я користувача вже зайняте.
     *
     * @param username ім'я користувача для перевірки
     * @return true, якщо ім'я користувача вже зайняте, false в іншому випадку
     */
    public boolean isUsernameTaken(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Перевіряє, чи електронна адреса вже зайнята.
     *
     * @param email електронна адреса для перевірки
     * @return true, якщо електронна адреса вже зайнята, false в іншому випадку
     */
    public boolean isEmailTaken(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Отримує загальну кількість користувачів.
     *
     * @return загальна кількість користувачів
     */
    public int getUserCount() {
        return userCount;
    }
}
