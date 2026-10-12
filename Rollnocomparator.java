
import java.util.Comparator;

public class Rollnocomparator implements Comparator<Student> {

    @Override
    public int compare(Student first, Student second) {
        return Integer.compare(first.getRollno(), second.getRollno());
    }
}