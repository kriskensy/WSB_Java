package pl.kriskensy;

import java.util.ArrayList;
import java.util.List;

//ten zbior ma dzialac na typie generycznym T, ma umiec raz przechowywac pacjentow, innym razem lekarzy a innym razem samochody.
// Czyli bedzie uniwersalny.
public class Collection<T> {
    private List<T> list;

    public Collection() {
        list = new ArrayList<T>();
    }

    public List<T> GetList() {
        return list;
    }
}