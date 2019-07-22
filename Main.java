public class Main {
    public static void main(String[] args) {
        String string = "1 3 1 2\\n2 3 2 2\\n5 6 7 1\\n3 3 1 0";
        Conventer test = new Conventer();
        String[][] stringarray = test.ConvertToArray(string);
        test.printString(stringarray);
        System.out.println();
        int[][] intarray = test.ParseToInt(stringarray);
        test.printInt(intarray);
        System.out.println();
        int result = test.Calculate(intarray);
        System.out.println(result);
    }
}

