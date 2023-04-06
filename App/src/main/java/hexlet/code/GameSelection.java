package hexlet.code;

import java.util.Scanner;
// TODO: на конечном этапе удали 11 строчку и включи 9
public class GameSelection {
    @SuppressWarnings({"checkstyle:Indentation", "checkstyle:NeedBraces"})
    public static void numSelection() { // выбор игры возвращает номер игры
        while (true) {
//            Scanner scanner = new Scanner(System.in);
            System.out.println("введите число: ");
        Scanner scanner = new Scanner("0");
            int gameNumber = scanner.nextInt();
            System.out.println("Your choice: " + gameNumber);
            if (gameNumber == 0)
                break;

            switch (gameNumber) {
                case 1:
                    System.out.println("The Greet game has started");
                    hexlet.code.Cli.name();
                    break;
                case 2:
                    System.out.println("The Even game has started");
                    break;
                case 3:
                    System.out.println("The Calc game has started");
                    break;
                case 4:
                    System.out.println("The GCD game has started");
                    break;
                case 5:
                    System.out.println("The Progression game has started");
                    break;
                case 6:
                    System.out.println("The Prime game has started");
                    break;
                case 0:
                    System.out.println("You are out of the game");
                    break;
                default:
                    System.out.println("Enter a number between 0 and 6");
            }
            scanner.close();
        }
    }
}

