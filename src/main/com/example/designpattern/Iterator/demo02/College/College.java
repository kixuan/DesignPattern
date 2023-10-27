package main.com.example.designpattern.Iterator.demo02.College;

import java.util.Iterator;

public interface College {

    public String getName();

    public void addDepartment(String name, String desc);

    /**
     * 返回一个迭代器，遍历
     */
    public Iterator createIterator();

}