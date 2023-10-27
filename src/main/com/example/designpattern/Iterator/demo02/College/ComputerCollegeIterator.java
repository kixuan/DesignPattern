package main.com.example.designpattern.Iterator.demo02.College;

import main.com.example.designpattern.Iterator.demo02.Department;

import java.util.Iterator;


public class ComputerCollegeIterator implements Iterator {
    private Department[] departments;
    // 遍历的位置
    private int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        super();
        this.departments = departments;
    }

    /**
     * 判断是否还有下一个元素
     */
    @Override
    public boolean hasNext() {
        return departments.length > position && departments[position] != null;
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

}