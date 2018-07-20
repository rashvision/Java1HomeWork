import java.util.Random;
import java.util.Scanner;

/** Домашнее задание №3
 * @version 20.07.2018
 * @author Рашид Бахмутов
 */

public class Homework3 {

    static Scanner scanner = new Scanner(System.in);

    public static void task1() {
        Random rand = new Random();

        int x = 0;

        while (x != -1) {
            x = rand.nextInt(10);

            for (int i = 0; i < 3; i++) {
                System.out.println("Введите число от 0 до 9..");
                int a = scanner.nextInt();

                if (a > x)
                    System.out.println("Число " + a + " больше чем загаданное");
                else if (a < x)
                    System.out.println("Число " + a + " меньше чем загаданное");
                else {
                    System.out.println("Вы угадали!");
                    break;
                }
                if (i==2)
                    System.out.println("Вы проиграли!");
            }
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
            int b = scanner.nextInt();
            if (b == 0)
                System.out.println("Игра окончена!");
                break;
        }
    }

}
