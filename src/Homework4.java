import java.util.Random;
import java.util.Scanner;

/** Домашнее задание №4
 * @version 23.07.2018
 * @author Рашид Бахмутов
 */

public class Homework4 {

        public static int SIZE = 3;
        public static int DOTS_TO_WIN = 3;
        public static int gameTurns = 0; //Шагов игры всего
        public static final char DOT_EMPTY = '•';
        public static final char DOT_X = 'X';
        public static final char DOT_O = 'O';
        public static char[][] map;
        public static Scanner sc = new Scanner(System.in);
        public static Random rand = new Random();

        public static void letsPlay(int a, int b) {

            if (a < b) {
                System.out.println("Размерность матрицы меньше длины линии для выигрыша");
                return;
            }

            SIZE = a;
            DOTS_TO_WIN = b;

            initMap();
            printMap();
            while (true) {
                humanTurn();
                printMap();
                if (checkWin(DOT_X)) {
                    System.out.println("Победил человек");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;

                }
                aiTurn();
                printMap();
                if (checkWin(DOT_O)) {
                    System.out.println("Победил Искуственный Интеллект");
                    break;
                }
                if (isMapFull()) {
                    System.out.println("Ничья");
                    break;
                }
            }
            System.out.println("Игра закончена");
        }
        public static boolean checkWin(char symb) {
//              Алгоритм проверки для мартицы 3х3:
//            for (int i = 0; i < SIZE; i++) {
//                if(map[i][0] == symb && map[i][1] == symb && map[i][2] == symb) return true;
//                if(map[0][i] == symb && map[1][i] == symb && map[2][i] == symb) return true;
//            }
//            if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
//            if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;

        // универсальный алгоритм проверки выигрыша

            if (gameTurns < DOTS_TO_WIN)
                return false;

            int hCount = 0; //счетчик по горизонтали
            int vCount = 0; //счетчик по вертикали
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    // проверка по горизонтали
                    if (map[i][j] == symb)
                        hCount++;
                    else
                        hCount = 0;
                    if (hCount == DOTS_TO_WIN)
                        return true;

                    // проверка по вертикали
                    if (map[j][i] == symb)
                        vCount++;
                    else
                        vCount = 0;
                    if (vCount == DOTS_TO_WIN)
                        return true;
                }
            }

            // проверка по диагонали
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {

                    int dCound1 = 0; // счетчик прямой диагонали
                    int dCound2 = 0; // счетчик обратной диагонали

                    for (int k = 0; k < DOTS_TO_WIN; k++) {

                        if (i+DOTS_TO_WIN <= SIZE && j+DOTS_TO_WIN <= SIZE) {
                            if (map[i + k][j + k] == symb)
                                dCound1++;
                            else
                                dCound1 = 0;
                            if (dCound1 == DOTS_TO_WIN)
                                return true;
                        }

                        if (j-DOTS_TO_WIN >= 0 && i+DOTS_TO_WIN <= SIZE) {
                            if (map[i + k][j - k] == symb)
                                dCound2++;
                            else
                                dCound2 = 0;
                            if (dCound2 == DOTS_TO_WIN)
                                return true;
                        }
                    }
                }
            }

            return false;
        }
        public static boolean isMapFull() {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == DOT_EMPTY) return false;
                }
            }
            return true;
        }
        public static void aiTurn() {
            int x, y;
            do {
                x = rand.nextInt(SIZE);
                y = rand.nextInt(SIZE);
            } while (!isCellValid(x, y));
            System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
            map[y][x] = DOT_O;
        }
        public static void humanTurn() {
            int x, y;
            do {
                System.out.println("Введите координаты в формате X Y");
                x = sc.nextInt() - 1;
                y = sc.nextInt() - 1;
            } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
            map[y][x] = DOT_X;
            gameTurns++;
        }
        public static boolean isCellValid(int x, int y) {
            if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
            if (map[y][x] == DOT_EMPTY) return true;
            return false;
        }
        public static void initMap() {
            map = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {

                for (int j = 0; j < SIZE; j++) {
                    map[i][j] = DOT_EMPTY;
                }
            }
        }
        public static void printMap() {
            for (int i = 0; i <= SIZE; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < SIZE; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
}

