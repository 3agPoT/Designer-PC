package practice.userInterface;

import practice.businessLogic.Computer;
import practice.businessLogic.CreateComputer;
import practice.businessLogic.JSONProcessor;

import java.util.Scanner;

import static practice.businessLogic.CreateComputer.cost;

/**
 * Клас UserInterface обробляє інтерфейс користувача для гостей і зареєстрованих користувачів.
 */
public class UserInterface {
    static int choise;
    Scanner in = new Scanner(System.in);
    CreateComputer createComputer = new CreateComputer();

    /**
     * Відображає гостьове меню.
     */

    // Метод для гостей
    public void guestMenu() {
        while (true) {
            System.out.println("██████╗░░█████╗░        ░█████╗░░█████╗░███╗░░██╗░██████╗████████╗██████╗░██╗░░░██╗░█████╗░████████╗░█████╗░██████╗░");
            System.out.println("██╔══██╗██╔══██╗        ██╔══██╗██╔══██╗████╗░██║██╔════╝╚══██╔══╝██╔══██╗██║░░░██║██╔══██╗╚══██╔══╝██╔══██╗██╔══██╗");
            System.out.println("██████╔╝██║░░╚═╝        ██║░░╚═╝██║░░██║██╔██╗██║╚█████╗░░░░██║░░░██████╔╝██║░░░██║██║░░╚═╝░░░██║░░░██║░░██║██████╔╝");
            System.out.println("██╔═══╝░██║░░██╗        ██║░░██╗██║░░██║██║╚████║░╚═══██╗░░░██║░░░██╔══██╗██║░░░██║██║░░██╗░░░██║░░░██║░░██║██╔══██╗");
            System.out.println("██║░░░░░╚█████╔╝        ╚█████╔╝╚█████╔╝██║░╚███║██████╔╝░░░██║░░░██║░░██║╚██████╔╝╚█████╔╝░░░██║░░░╚█████╔╝██║░░██║");
            System.out.println("╚═╝░░░░░░╚════╝░        ░╚════╝░░╚════╝░╚═╝░░╚══╝╚═════╝░░░░╚═╝░░░╚═╝░░╚═╝░╚═════╝░░╚════╝░░░░╚═╝░░░░╚════╝░╚═╝░░╚═╝");
            System.out.println("╔════════════════════════════════╗");
            System.out.println("║          Гостьове меню         ║");
            System.out.println("╠════════════════════════════════╣");
            System.out.println("║ 1) Реєстрація                  ║");
            System.out.println("║ 2) Вхід                        ║");
            System.out.println("║ 3) Вихід                       ║");
            System.out.println("╚════════════════════════════════╝");
            System.out.print("Ваш вибір: ");

            choise = in.nextInt();
            switch (choise) {
                case 1:
                    System.out.println("Реєстрація:");
                    UserManagement.registerUser();
                    break;
                case 2:
                    System.out.println("Вхід:");
                    UserManagement.login();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Недійсний вибір");
            }
        }
    }

    /**
     * Відображає меню для зареєстрованих користувачів.
     *
     * @param username Ім'я зареєстрованого користувача.
     */

    // Метод для зареєстрованих користувачів
    public void registeredUserMenu(String username) {
        while (true) {
            System.out.println("██████╗░░█████╗░        ░█████╗░░█████╗░███╗░░██╗░██████╗████████╗██████╗░██╗░░░██╗░█████╗░████████╗░█████╗░██████╗░");
            System.out.println("██╔══██╗██╔══██╗        ██╔══██╗██╔══██╗████╗░██║██╔════╝╚══██╔══╝██╔══██╗██║░░░██║██╔══██╗╚══██╔══╝██╔══██╗██╔══██╗");
            System.out.println("██████╔╝██║░░╚═╝        ██║░░╚═╝██║░░██║██╔██╗██║╚█████╗░░░░██║░░░██████╔╝██║░░░██║██║░░╚═╝░░░██║░░░██║░░██║██████╔╝");
            System.out.println("██╔═══╝░██║░░██╗        ██║░░██╗██║░░██║██║╚████║░╚═══██╗░░░██║░░░██╔══██╗██║░░░██║██║░░██╗░░░██║░░░██║░░██║██╔══██╗");
            System.out.println("██║░░░░░╚█████╔╝        ╚█████╔╝╚█████╔╝██║░╚███║██████╔╝░░░██║░░░██║░░██║╚██████╔╝╚█████╔╝░░░██║░░░╚█████╔╝██║░░██║");
            System.out.println("╚═╝░░░░░░╚════╝░        ░╚════╝░░╚════╝░╚═╝░░╚══╝╚═════╝░░░░╚═╝░░░╚═╝░░╚═╝░╚═════╝░░╚════╝░░░░╚═╝░░░░╚════╝░╚═╝░░╚═╝");
            System.out.println("╔═════════════════════════════════════════╗");
            System.out.println("║     Меню зареєстрованого користувача    ║");
            System.out.println("╠═════════════════════════════════════════╣");
            System.out.println("║ 1) Основні компоненти                   ║");
            System.out.println("║ 2) Опційні компоненти                   ║");
            System.out.println("║ 3) Готові збірки                        ║");
            System.out.println("║ 4) Вихід                                ║");
            System.out.println("╚═════════════════════════════════════════╝");
            System.out.print("Ваш вибір: ");

            choise = in.nextInt();
            switch (choise) {
                case 1:
                    System.out.println("Основні компоненти:");
                    coreComponents();
                    break;
                case 2:
                    System.out.println("Опційні компоненти:");
                    helperComponents();
                    break;
                case 3:
                    System.out.println("Готові збірки:");
                    try {
                        Computer computer = JSONProcessor.loadComponentsFromJson("Data/computer.json");
                        if (computer != null) {
                            System.out.println(computer.toString());
                            // Збереження комп'ютера у файл JSON
                            saveComputerToJson(computer);
                        } else {
                            System.out.println("Немає збережених компонентів.");
                        }
                    } catch (Exception e) {
                        System.out.println("Помилка завантаження готових збірок: " + e.getMessage());
                    }
                    // Додайте виклик методу displayCustomBuild() замість createComputer.createComputer()
                    displayCustomBuild();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Недійсний вибір");
            }
        }
    }

    /**
     * Відображає основні компоненти.
     */
    public void coreComponents(){
        createComputer.buildCoreComponents();
    }

    /**
     * Відображає допоміжні компоненти.
     */
    public void helperComponents() {
        while (true) {
            System.out.println("╔════════════════════════════════════════╗");
            System.out.println("║           Опційні компоненти           ║");
            System.out.println("╠════════════════════════════════════════╣");
            System.out.println("║ 1) Клавіатура                          ║");
            System.out.println("║ 2) Миша                                ║");
            System.out.println("║ 3) Монітор                             ║");
            System.out.println("║ 4) Освітлення                          ║");
            System.out.println("║ 5) Колонки                             ║");
            System.out.println("║ 6) Повернутися до головного меню       ║");
            System.out.println("╚════════════════════════════════════════╝");
            int option = in.nextInt();

            if (option == 6) {
                break;
            }

            switch (option) {
                case 1:
                    createComputer.buildKeyboard();
                    break;
                case 2:
                    createComputer.buildMouse();
                    break;
                case 3:
                    createComputer.buildMonitor();
                    break;
                case 4:
                    createComputer.buildLighting();
                    break;
                case 5:
                    createComputer.buildSpeaker();
                    break;
                default:
                    System.out.println("Недійсний вибір");
            }
        }
    }

    /**
     * Відображає спеціальну збірку та її вартість.
     */
    public void displayCustomBuild(){
        System.out.println("Ціна вашої кастомної збірки: " + cost + "₴" + "\nВибрані вами компоненти:");
        createComputer.buildComputer();
    }

    /**
     * Зберігає конфігурацію комп’ютера у форматі JSON.
     *
     * @param computer Конфігурація комп’ютера, яку потрібно зберегти.
     */
    public void saveComputerToJson(Computer computer) {
        createComputer.saveComputerToJson(computer);
    }
}
