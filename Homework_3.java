import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Homework_3 {
    public static void main(String[] args) {
        String B = "";
        String A = GuessWord(B);
        System.out.println(A);
        int C=Calculator();
        System.out.println(C);

    }
    public static int Calculator() {
        String input=scanner.nextLine();
        int len = input.length();
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        for (int i = 0; i < len; i++) {
            if ((input.charAt(i) != '+') && (input.charAt(i) != '-')&& (input.charAt(i) != '*')&& (input.charAt(i) != '/')) {
                if ((i + 1 <= len - 1)) {
                    if ((input.charAt(i + 1) != '+') && (input.charAt(i + 1) != '-')) {
                        String temp = "";
                        temp = temp + input.charAt(i) + input.charAt(i + 1);
                        int tempToInt = Integer.parseInt(temp);
                        list1.add(tempToInt);
                    }
                    list1.add(input.charAt(i) - '0');
                }
            } else if ((input.charAt(i) == '+') && (input.charAt(i) == '-')&& (input.charAt(i) == '*')&& (input.charAt(i) == '/')){
                list2.add(input.charAt(i));
            } else {
                System.out.println("Incorrect symbols or different operators, please enter a numbers and only one type of operator !");
                return(-1);
            }
        }
        int result = 0;
        result = result + (int) list1.get(0);
        for (int t = 0; t < list2.size(); t++) {
            char oper = (char) list2.get(t);
            if (oper == '+') {
                result = result + (int) list1.get(t);
            } else if (oper == '-') {
                result = result - (int) list1.get(t);
            } else if (oper == '*') {
                result = result * (int) list1.get(t);
            }else if (oper == '/') {
                result = result / (int) list1.get(t);
            }
        }return result;
    }
    private static Scanner scanner = new Scanner(System.in);

    public static String GuessWord(String input) {
        String arr[] = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random random = new Random();
        int a = random.nextInt(25);
        System.out.println("Я загадал слово, сможете его угадать?");
        String str = arr[a];
        int b = 0;
        input = scanner.nextLine();
        String answer_1 = "***************";
        StringBuilder answer = new StringBuilder(answer_1);
        while (!str.equals(input)) {
            if (str.length() >= input.length()) {
                b = input.length();
            } else b = str.length();
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
