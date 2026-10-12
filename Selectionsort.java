
import java.util.ArrayList;
import java.util.Comparator;

public class Selectionsort {

    /**
     * Sorts the list in place. On each pass it finds the smallest remaining
     * element (according to the comparator) and swaps it into position i.
     */
    public static <T> void sort(ArrayList<T> list, Comparator<T> comparator) {
        for (int i = 0; i < list.size() - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < list.size(); j++) {
                if (comparator.compare(list.get(j), list.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                T temp = list.get(i);
                list.set(i, list.get(minIndex));
                list.set(minIndex, temp);
            }
        }
    }
}