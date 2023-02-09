package headfirst.designpatterns.iterator.mergecageIterable;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}

