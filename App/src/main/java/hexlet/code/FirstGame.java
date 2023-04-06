package hexlet.code;

import java.util.Scanner;

public class FirstGame {
    @SuppressWarnings("checkstyle:Indentation")
    public static void main(String[] args) {

        FirstGame.Event();
    }
    @SuppressWarnings({"checkstyle:NeedBraces", "checkstyle:MethodName"})
    public static void Event() {

        String name = "bill";

        int count = 0;
        while (count >= 2) {
            count++;
            int random = (int) (Math.random() * 100);

            System.out.println("Hello, " + name);

            System.out.println("Question: " + random);
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.\n" + "");

            Scanner scanner = new Scanner(System.in);
            String string = scanner.nextLine();
            String eventString = random % 2 == 0 ? "yes" : "no";

            if (string.equalsIgnoreCase(eventString)) {
                System.out.println("Correct!");
            } else
                System.out.println("нет");
            return;


        }
        System.out.println("Congratulations, " + name + "32 + 23");

    }
}
