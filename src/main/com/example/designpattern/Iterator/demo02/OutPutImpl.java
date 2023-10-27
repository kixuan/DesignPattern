package main.com.example.designpattern.Iterator.demo02;

import main.com.example.designpattern.Iterator.demo02.College.College;

import java.util.Iterator;
import java.util.List;

public class OutPutImpl {


    // 学院集合
    private List<College> colleges;

    public OutPutImpl(List<College> colleges) {
        super();
        this.colleges = colleges;
    }

    /**
     * 遍历所有学院，然后调用printDepartment 输出各个学院的系
     */
    public void printCollege() {
        // 从collegeList 取出所有学院，Java中的list 已经实现Iterator
        for (College college : colleges) {
            System.out.println("====" + college.getName() + "====");
            printDepartment(college.createIterator());
        }
    }

    /**
     * 输出学院里的系
     */
    public void printDepartment(Iterator iterator) {
        while (iterator.hasNext()) {
            Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }

}