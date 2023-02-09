package headfirst.designpatterns.iterator.dinnermenuwithiterator;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}

