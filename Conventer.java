public class Conventer {
    public String[][] ConvertToArray(String s) {
        int n = 0;
        s = s.replace("\\n", "").replace(" ", "");
        String s1[] = s.split("");
        double rows1 = Math.sqrt(s1.length );
        int rows = (int) rows1;
        try {if (rows1 != 4.00) {
            throw new IndexOutOfBoundsException("NPE Test");
        }
        } catch (IndexOutOfBoundsException е) {
            System.out.println("Matrix is not 4X4 size!");
        }
        String array[][] = new String[rows][rows];
        for (int j = 0; j < rows; j++) {
            for (int k = 0; k < rows; k++) {
                array[j][k] = s1[n];
                n++;
            }
        }
       /* for (int j = 0; j < rows; j++) {
            for (int k = 0; k < columns; k++) {
                System.out.print(array[j][k] + " ");
            }
            System.out.println("");
        }*/
        return array;
    }

    public int[][] ParseToInt(String[][] s) {
        int[][] intarray = new int[4][4];
        try {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    intarray[i][j] = Integer.parseInt(s[i][j]);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Wrong type, ensure that all values are numbers!");
        }
        /*for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 4; k++) {
                System.out.print(intarray[j][k] + " ");
            }
            System.out.println("");
        }*/
        return intarray;
    }


    public int Calculate(int[][] array) {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum += array[i][j];
            }
        }
        int result = sum / 2;
        return result;
    }

    public void printInt(int[][] intarray) {
        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 4; k++) {
                System.out.print(intarray[j][k] + " ");
            }
            System.out.println("");
        }
    }
    public void printString(String[][] stringarray) {
        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 4; k++) {
                System.out.print(stringarray[j][k] + " ");
            }
            System.out.println("");
        }
    }
}


