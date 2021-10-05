package HW5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyList<T extends Comparable<T>> {
    private final ArrayList<T> data = new ArrayList<>();

    MyList() {
    }

    MyList(T[] data) {
        this.data.addAll(Arrays.stream(data).toList());
    }

    public void add(T item) {
        if (item == null) throw new NullPointerException();
        data.add(item);
    }

    public T largest() {
        if (data.size() == 0) throw new NoSuchElementException();
        return data.stream().max(T::compareTo).get();
    }

    public T smallest() {
        if (data.size() == 0) throw new NoSuchElementException();
        return data.stream().min(T::compareTo).get();
    }
}

