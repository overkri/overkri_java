public class SwapArrayElements {
    public Object [] swap2(Object []array, int i, int j) {
        Object tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
        return array;
    }

}
