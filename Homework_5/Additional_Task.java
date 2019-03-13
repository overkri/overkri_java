package Homework_5;


public class Additional_Task {
    private static int N = 20;

    public static void CheckArray(int[] arr) {
        int[] counter = new int[N + 1];
        for (int i = 0; i < arr.length; i++) {
            counter[arr[i]]++;
        }
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] != 0) {
                System.out.println("Число " + i + " Встречается " + counter[i] + " раз.");
            }
        }
        System.out.println();
    }
}



