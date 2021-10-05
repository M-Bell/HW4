package HW5;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyListUpperNumbers<T extends Number> {
    private final ArrayList<T> data = new ArrayList<>();

    public void add(T item) {
        if (item == null) throw new NullPointerException();
        data.add(item);
    }

    public T largest() {
        if (data.size() == 0) throw new NoSuchElementException();
        return data.stream().max((o1, o2) -> {
            BigDecimal bd = BigDecimal.valueOf(o1.doubleValue());
            BigDecimal bd1 = BigDecimal.valueOf(o2.doubleValue());
            return bd.compareTo(bd1);
        }).get();
    }

    public T smallest() {
        if (data.size() == 0) throw new NoSuchElementException();
        return data.stream().min((o1, o2) -> {
            BigDecimal bd = BigDecimal.valueOf(o1.doubleValue());
            BigDecimal bd1 = BigDecimal.valueOf(o2.doubleValue());
            return bd.compareTo(bd1);
        }).get();
    }
}

