
import java.util.Random;
import java.util.Scanner;

public class Homework_4 {
    static int SIZE_X = 5; //Параметры поля-количество строк//
    static int SIZE_Y = 5; //Параметры поля-количество столбцов//
    static int WIN_REQ_STACKS = 4; //Параметры игры-количество фишек для победы//

    static char[][] field = new char[SIZE_Y][SIZE_X];

    static char PLAYER_DOT = 'X';
    static char AI_DOT = 'O';
    static char EMPTY_DOT = '.';

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();


    private static void initField() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                field[i][j] = EMPTY_DOT;
            }
        }
    }

    // метод для вывода на консоль поля
    private static void printField() {
        for (int i = 0; i < SIZE_Y; i++) {
            System.out.print(" " + (i + 1));
        }
        System.out.println();
        for (int i = 0; i < SIZE_Y; i++) {
            System.out.print("--");
        }
        System.out.println();
        for (int i = 0; i < SIZE_Y; i++) {
            System.out.print("|");
            for (int j = 0; j < SIZE_X; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println(i + 1);
        }
        System.out.println("-----------");
    }

    private static void setSym(int y, int x, char sym) {
        field[y][x] = sym;
    }

    private static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x > SIZE_X - 1 || y > SIZE_Y - 1) {
            return false;
        }
        return field[y][x] == EMPTY_DOT;
    }

    // ход человека
    private static void playerStep() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты: X Y (1 - 5)");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(y, x));
        setSym(y, x, PLAYER_DOT);
    }

    //Блокирование ходов AI// не успел сделать
    /*private  boolean AI_CHECK_TO_BLOCK() {
        int player_counts = 0;
        int ai_counts = 0;
        // Проверяем строки //
        player_counts = 0;
        for (int i = 0; i < SIZE_Y; i++) {
            player_counts = 0;
            for (int j = 0; j < SIZE_X; j++) {

                if (field[i][j] == PLAYER_DOT) player_counts++;
                else if (field[i][j] == AI_DOT) ai_counts++;
                if (player_counts == 2 && ai_counts == 0) {
                    return true;
                }
            }
        }
        // Проверяем стобцы //
        player_counts = 0;
        for (int i = 0; i < SIZE_Y; i++) {
            player_counts = 0;
            for (int j = 0; j < SIZE_X; j++) {
                if (field[j][i] == PLAYER_DOT) player_counts++;
                else if (field[i][i] == AI_DOT) ai_counts++;
            }
            if (player_counts == 2 && ai_counts == 0) {
                return true;
            }
        }
        // Проверяем диагональ //
        player_counts = 0;
        for (int i = 0; i < SIZE_Y; i++) {
            if (field[i][i] == PLAYER_DOT) player_counts = 0;
            else if (field[i][i] == AI_DOT) ai_counts++;
        }
        if (player_counts == 2 && ai_counts == 0) {
            return true;
        }
        // Проверяем обратную диагональ //
        player_counts = 0;
        for (int i = SIZE_Y - 1, j = 0; i >= 0 && j < SIZE_X; i--, j++) {
            if (field[j][i] == PLAYER_DOT) player_counts = 0;
            else if (field[i][i] == AI_DOT) ai_counts++;
        }
        if (player_counts == 2 && ai_counts == 0) {
            return true;
        }
        return false;
    }*/

    // ход AI
    private static void aiStep() {
        int x;
        int y;
    do { x = random.nextInt(SIZE_X);
            y = random.nextInt(SIZE_Y);
        } while (!isCellValid(y, x));
        setSym(y, x, AI_DOT);
    }

    private static boolean isDraw() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                if (field[i][j] == EMPTY_DOT) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkWin(char sym) {
        int x_count = 0;
        int o_count = 0;
        int difference = 0;
        if (WIN_REQ_STACKS < SIZE_Y) {
            difference = (SIZE_Y - WIN_REQ_STACKS) + 1;
        }
        for (int B = 0; B < difference; B++) {
            // Проверяем строки //
            x_count = o_count = 0;
            for (int i = 0; i < SIZE_X; i++) {
                x_count = o_count = 0;
                for (int j = B; j < WIN_REQ_STACKS + B; j++) {
                    if (field[i][j] == PLAYER_DOT) x_count++;
                    else if (field[i][j] == AI_DOT) o_count++;
                    else if (field[i][j] == EMPTY_DOT) break;
                }
                if (x_count == WIN_REQ_STACKS || o_count == WIN_REQ_STACKS) {
                    return true;
                }
            }
            // Проверяем стобцы //
            x_count = o_count = 0;
            for (int i = 0; i < SIZE_Y; i++) {
                x_count = o_count = 0;
                for (int j = B; j < WIN_REQ_STACKS + B; j++) {
                    if (field[j][i] == PLAYER_DOT) x_count++;
                    else if (field[j][i] == AI_DOT) o_count++;
                    else if (field[j][i] == EMPTY_DOT) break;
                }
                if (x_count == WIN_REQ_STACKS || o_count == WIN_REQ_STACKS) {
                    return true;
                }
            }
            // Проверяем диагонали //
            x_count = o_count = 0;
            for (int i = B; i < WIN_REQ_STACKS + B; i++) {
                if (field[i][i] == PLAYER_DOT) x_count++;
                else if (field[i][i] == AI_DOT) o_count++;
                else if (field[i][i] == EMPTY_DOT) break;
            }
            if (x_count == WIN_REQ_STACKS || o_count == WIN_REQ_STACKS) {
                return true;
            }
            // Проверяем обратную диагональ //
            x_count = o_count = 0;
            for (int i = SIZE_Y - 1, j = 0; i >= 0 && j < SIZE_X; i--, j++) {
                if (field[j][i] == PLAYER_DOT) x_count++;
                else if (field[j][i] == AI_DOT) o_count++;
                else if (field[i][i] == EMPTY_DOT) break;
            }
            if (x_count == WIN_REQ_STACKS || o_count == WIN_REQ_STACKS) {
                return true;
            }
            // Проверяем боковые диагонали //
            if (WIN_REQ_STACKS < SIZE_Y) {
                x_count = o_count = 0;
                for (int i = WIN_REQ_STACKS, j = 0; i >= 0 && j < WIN_REQ_STACKS; i--, j++) {
                    if (field[j][i - 1] == PLAYER_DOT || field[j + 1][i] == PLAYER_DOT) x_count++;
                    else if (field[j][i - 1] == AI_DOT || field[j + 1][i] == AI_DOT) o_count++;
                }
                if (x_count == WIN_REQ_STACKS || o_count == WIN_REQ_STACKS) {
                    return true;
                }
                x_count = o_count = 0;
                for (int i = 0; i < WIN_REQ_STACKS; i++) {
                    if (field[i + 1][i] == PLAYER_DOT || field[i][i + 1] == PLAYER_DOT) x_count++;
                    else if (field[i + 1][i] == AI_DOT || field[i][i + 1] == AI_DOT) o_count++;
                }
                if (x_count == WIN_REQ_STACKS || o_count == WIN_REQ_STACKS) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        initField();
        printField();

        while (true) {
            playerStep();
            printField();
            if (checkWin(PLAYER_DOT)) {
                System.out.println("Player wins!");
                break;
            }
            if (isDraw()) {
                System.out.println("DRAW");
                break;
            }

            aiStep();
            printField();
            if (checkWin(AI_DOT)) {
                System.out.println("AI wins!");
                break;
            }
            if (isDraw()) {
                System.out.println("DRAW");
                break;
            }
        }
    }


}
