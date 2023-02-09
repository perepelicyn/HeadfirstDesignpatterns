package headfirst.designpatterns.adapter.iterenum;

import java.util.*;

public class EnumerationIteratorTestDrive {
    public static void main (String args[]) {
        Vector<String> v = new Vector<String>(Arrays.asList("1","2","3"));
        Iterator<?> iterator = new EnumerationIterator(v.elements());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
