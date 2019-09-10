import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
    public static <T> ArrayList<T> ArraytoArrayList(T[] array) {
        return new ArrayList<T>(Arrays.asList(array));
    }
}
