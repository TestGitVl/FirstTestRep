import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите мат операцию: ");
        String operation = in.next();

        System.out.println("Введите 2 числа: ");
        int a = in.nextInt();
        int b = in.nextInt();

        switch (operation) {
            case "+":
                System.out.println("Ответ: " + (a + b));
                break;

            case "-":
                System.out.println("Ответ: " + (a - b));
                break;

            case "*":
                System.out.println("Ответ: " + (a * b));
                break;

            case "/":
                if (a == 0 && b == 0) {
                    System.out.println("Делить на ноль нельзя");
                }

                System.out.println("Ответ: " + (a / b) );
                break;

            default:
                System.out.println("Ошибка");
        }

    }
}
