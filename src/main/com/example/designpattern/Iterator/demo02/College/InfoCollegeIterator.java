package main.com.example.designpattern.Iterator.demo02.College;

import main.com.example.designpattern.Iterator.demo02.Department;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator {

    private List<Department> departmentList;

    /**
     * 索引
     */
    private int index = -1;

    public InfoCollegeIterator(List<Department> departmentList) {
        super();
        this.departmentList = departmentList;
    }

    /**
     * 判断list中还有没有下一个元素
     */
    @Override
    public boolean hasNext() {
        if (index >= departmentList.size() - 1) {
            return false;
        }
        index += 1;
        return true;
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }

    public void remove() {
    }

}