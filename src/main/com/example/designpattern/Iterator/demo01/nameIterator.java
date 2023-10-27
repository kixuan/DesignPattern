package main.com.example.designpattern.Iterator.demo01;

import java.util.Iterator;

/**
 * @author kixuan
 * @version 1.0
 */
public class nameIterator implements Iterator {

    private String[] names;
    private int index;

    public nameIterator(String[] names) {
        super();
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        return names.length > index && names[index] != null;
    }

    @Override
    public Object next() {
        String name = names[index];
        index += 1;
        return name;
    }
}
