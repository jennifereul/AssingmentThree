import java.util.Arrays;

// Generic version of AList
class GenericAList<T> {
    private T[] array;
    private int maxSize;
    private int currentSize;

    GenericAList() {
        //Initial size needed??
        maxSize = 10;
        currentSize = 0;
        array = (T[]) new Object[maxSize];
    }

    void listAdd(T item) {
        if (currentSize == maxSize) {
            maxSize *= 2;
            array = Arrays.copyOf(array, maxSize);
        }
        array[currentSize++] = item;
    }

    void listRemove(int position) {
        if (position < 0 || position >= currentSize) {
            System.out.println("Invalid position!");
            return;
        }
        for (int i = position; i < currentSize - 1; i++) {
            array[i] = array[i + 1];
        }
        currentSize--;
    }

    public String toString() {
        if (currentSize == 0) {
            return "Empty List";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < currentSize - 1; i++) {
            sb.append(array[i].toString()).append("\n");
        }
        sb.append(array[currentSize - 1].toString());
        return sb.toString();
    }
}