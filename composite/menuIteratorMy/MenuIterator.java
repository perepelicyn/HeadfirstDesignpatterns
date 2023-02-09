package headfirst.designpatterns.composite.menuIteratorMy;


import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Stack;

public class MenuIterator implements Iterator<MenuComponent> {
    Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();
    MenuComponent component;

    public MenuIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.empty())
            return false;
        else{
            Iterator<MenuComponent> iterator = stack.peek();
            if(!iterator.hasNext()){
                stack.pop();
                return hasNext();
            }
            else
                return true;
        }
    }

    @Override
    public MenuComponent next() {

        if (hasNext()) {
            Iterator<MenuComponent> iterator = stack.peek();
            component = iterator.next();
            stack.push(component.getIterator());
            return component;
        }
        else
            return null;
    }
}


