package BookAndAuthor;

import java.util.Comparator;

public class sortByName implements Comparator<sach> {
    @Override
    public int compare(sach o1, sach o2) {
        return o1.getNameBook().compareTo(o2.getNameBook());
    }
}
