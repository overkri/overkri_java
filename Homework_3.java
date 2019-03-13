import java.util.Random;
import java.util.Scanner;

public class Homework_3 {
    public static void main(String[] args) {
        String B = "";
        String A = GuessWord(B);
        System.out.println(A);
    }

    private static Scanner scanner = new Scanner(System.in);

    public static String GuessWord(String input) {
        String arr[] = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        int a = random.nextInt(25);
        System.out.println("Я загадал слово, сможете его угадать?");
        String str = arr[a];
        System.out.println(str);
        int b = 0;
        input = scanner.nextLine();
        while (!str.equals(input)) {
            String answer_1 = "***************";
            StringBuilder answer = new StringBuilder(answer_1);
            if (str.length() >= input.length()) {
                b = input.length();
            }else b = str.length();
            for (int i = 0; i < b; ++i) {
                if (input.charAt(i) == str.charAt(i)) {
                    answer.setCharAt(i, input.charAt(i));
                }
            }
            System.out.println(answer);
            System.out.println("Неправильно, попробуй еще раз");
            input = scanner.nextLine();
        }
        return ("Верно!");
    }
}