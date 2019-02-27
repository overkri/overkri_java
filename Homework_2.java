import java.util.*

public class homework_2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] A = SwapZeroOne();
        System.out.println(Arrays.toString(A));
        int[] B = FillArray();
        System.out.println(Arrays.toString(B));
        int[] C = MultiplyIfLessThan6();
        System.out.println(Arrays.toString(C));
        int[][] D = Draw1Diagonal();
        System.out.println(Arrays.toString(D));
        String[] E = MaxAndMinInArray();
        System.out.println(Arrays.toString(E));
        boolean F = IfArrayHasEqualParts();
        System.out.println(F);
        int[] G = MoveArray();
        System.out.println(Arrays.toString(G));
    }

    //Задание 1//
    private static int[] SwapZeroOne() {
        int A = scanner.nextInt();
        int[] arr_1 = new int[A];
        for (int i = 0; i < A; i++) {
            arr_1[i] = scanner.nextInt();
            arr_1[i] = arr_1[i] == 0 ? 1 : 0;
        }
        return arr_1;
    }

    //Задание 2//
    private static int[] FillArray() {
        int arr_2[] = new int[8];
        for (int i = 0; i < 8; ++i) {
            arr_2[i] += 3 * i;
        }
        return arr_2;
    }

    //Задание 3//
    private static int[] MultiplyIfLessThan6() {
        int J = scanner.nextInt();
        int arr_3[] = new int[J];
        for (int i = 0; i < J; ++i) {
            arr_3[i] = scanner.nextInt();
            if (arr_3[i] < 6) {
                arr_3[i] *= 2;
            }
        }
        return arr_3;
    }

    //Задание 4//
    private static int[][] Draw1Diagonal() {
        int B = scanner.nextInt();
        int arr_4[][] = new int[B][B];
        for (int i = 0; i < B; ++i) {
            for (int j = 0; j < B; ++j) {
                System.out.print(((i == j) || (i + j + 1 == B)) ? 1 : " ");
            }
            System.out.println();
        }
        return (arr_4);
    }

    //Задание 5//
    private static String[] MaxAndMinInArray() {
        int C = scanner.nextInt();
        int arr_5[] = new int[C];
        for (int i = 0; i < C; ++i) {
            arr_5[i] = scanner.nextInt();
        }
        int tmp = arr_5[0];
        int tmp_2 = arr_5[0];
        for (int i = 1; i < C; ++i) {
            if (tmp <= arr_5[i]) {
                tmp = arr_5[i];
            }
        }
        for (int i = 1; i < C; ++i) {
            if (tmp_2 >= arr_5[i]) {
                tmp_2 = arr_5[i];
            }
        }
        String arr_add[] = new String[2];
        arr_add[0] = "Минимальное значение " + tmp_2;
        arr_add[1] = "Максимальное значение " + tmp;
        return arr_add;
    }

    //Задание 6//
    private static boolean IfArrayHasEqualParts() {
        int sum = 0;
        int var_1 = 0;
        int D = scanner.nextInt();
        int j = 0;
        int arr_6[] = new int[D];
        for (int i = 0; i < D; ++i) {
            arr_6[i] = scanner.nextInt();
            sum += arr_6[i];
        }
        for (int i = 0; i < D; ++i) {
            var_1 += arr_6[i];
            sum -= arr_6[i];
            if (var_1 == sum) {
                j += 1;
                break;
            }
        }
        return (j == 1);
    }

    /*//Задание 7// - Не успел сделать
    private static int[] MoveArray() {
        int C = scanner.nextInt();
        int n = scanner.nextInt();
        if (n > C) {
            n = n % C;
        }
        int arr_7[] = new int[C];
        for (int i = 0; i < C; ++i) {
            arr_7[i] = scanner.nextInt();
        }

        return (arr_7);

    }*/
}