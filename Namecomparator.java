
import java.util.Comparator;

public class Namecomparator implements Comparator<Student> {

    @Override
    public int compare(Student first, Student second) {
        int result = first.getName().compareToIgnoreCase(second.getName());
        if (result == 0) {
            result = Integer.compare(first.getRollno(), second.getRollno());
        }
        return result;
    }
}