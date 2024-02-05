package practice.userInterface;

import java.util.UUID;

/**
 * Клас користувача представляє користувача в системі.
 */
public class User {
    private String id;
    private String username;
    private String password;
    private String email;
    private String phone;

    /**
     * Створює новий об'єкт користувача.
     */
    public User() {
    }

    /**
     * Створює новий об’єкт користувача з указаними деталями.
     *
     * @param username ім'я користувача
     * @param password пароль користувача
     * @param email    електронну адресу користувача
     * @param phone    номер телефону користувача
     */
    public User(String username, String password, String email, String phone) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
    }

    /**
     * Отримує ідентифікатор користувача.
     *
     * @return ідентифікатор користувача
     */
    public String getId() {
        return id;
    }

    /**
     * Встановлює ID користувача.
     *
     * @param id ідентифікатор користувача
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Отримує ім'я користувача.
     *
     * @return ім'я користувача
     */
    public String getUsername() {
        return username;
    }

    /**
     * Отримує пароль користувача.
     *
     * @return пароль користувача
     */
    public String getPassword() {
        return password;
    }

    /**
     * Отримує електронну пошту користувача.
     *
     * @return електронну адресу користувача
     */
    public String getEmail() {
        return email;
    }

    /**
     * Встановлює електронну адресу користувача.
     *
     * @param email електронну адресу користувача
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Отримує номер телефону користувача.
     *
     * @return номер телефону користувача
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Встановлює номер телефону користувача.
     *
     * @param phone номер телефону користувача
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
