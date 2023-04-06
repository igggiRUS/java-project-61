package hexlet.code;

import java.util.Scanner;
// TODO: на конечном этапе удали 9 строчку и включи 8
public  class Cli {
    public static String name() { // выбор имени игрока
        System.out.println("Welcome to the Brain Games!");
//        Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner("Jhon"); // включен на время тестов
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        scanner.close();
        return userName;
    }
}
