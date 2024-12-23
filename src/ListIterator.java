import java.util.Iterator;
import java.util.List;

public class ListIterator<T> implements Iterator<T> {

    private List<T> iterable;
    int cur = 0;

    public ListIterator(List<T> iterable) {
        this.iterable = iterable;
    }

    @Override
    public boolean hasNext() {
        return cur < iterable.size();
    }

    @Override
    public T next() {
        if (!hasNext())
            throw new RuntimeException("No more elements to iterate");
        T el = iterable.get(cur);
        cur++;
        return el;
    }
}
