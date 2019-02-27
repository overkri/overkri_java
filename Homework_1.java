import java.util.*;
public class Homework_1 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Задание 2//
        byte g_1 = 127;
        short h_1 = 1000;
        int a_1 = 100;
        long l_1 = 100;
        char b_1 = 'v';
        float d_1 = 0.1F;
        double f_1 = 10.5;
        boolean learnJava = true;
        int a = 0, c = 0, d = 0, e = 0, b = 0,  x = 0, v = 0;
        int hw_3 = homework_1_3(a,b,c,d);
        System.out.println(hw_3);
        boolean hw_4=homework_1_4(c,d);
        System.out.println(hw_4);
        String hw_5=homework_1_5(e);
        System.out.println(hw_5);
        boolean hw_6=homework_1_6(x);
        System.out.println(hw_6);
        String hw_7=homework_1_7();
        System.out.println(hw_7);
        String hw_8=homework_1_8(v);
        System.out.println(hw_8);

    }
     //Задание 3//
           private static int homework_1_3 ( int a,int b,int c,int d) {
                 a = scanner.nextInt();
                 b = scanner.nextInt();
                 c = scanner.nextInt();
                 d = scanner.nextInt();
                return(a * (b + (c / d)));
            }
     //Задание 4//
           private static boolean homework_1_4 ( int num_1, int num_2){
                 num_1 = scanner.nextInt();
                 num_2 = scanner.nextInt();
                if (num_1 + num_2 >= 10 & num_1 + num_2 <= 20) {
                    return(true);
                }else return(false);
            }
     //Задание 5//
           private static String homework_1_5 ( int unknown_number){
                unknown_number = scanner.nextInt();
                if (unknown_number >= 0) {
                    return (String.format("Число положительное"));
                } else return(String.format("Число отрицательное"));
            }
     //Задание 6//
          private static boolean homework_1_6 ( int if_negative) {
                if_negative = scanner.nextInt();
            if (if_negative < 0) {
                return (true);
        }   else return (false);
    }
     //Задание 7//
          private static String homework_1_7 ( ) {
                Scanner in = new Scanner(System.in);
                String name = in.nextLine();
                return(String.format("Привет, " + name + "!"));
            }
     //Задание 8//
           private static String homework_1_8 ( int year) {
                year = scanner.nextInt();
                if ((year % 4 == 0 & year % 100 != 0) || year % 400 == 0) {
                    return(String.format("Год високосный"));
                }else return (String.format("Год не високосный"));
            }
}
