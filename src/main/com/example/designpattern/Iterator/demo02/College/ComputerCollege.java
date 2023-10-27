package main.com.example.designpattern.Iterator.demo02.College;

import main.com.example.designpattern.Iterator.demo02.Department;

import java.util.Iterator;

public class ComputerCollege implements College {

    private Department[] departments;
    // 保持当前数组的对象个数
    private int numOfDepartment = 0;

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("java", "java");
        addDepartment("前端", "前端");
        addDepartment("大数据", "大数据");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment += 1;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }

}