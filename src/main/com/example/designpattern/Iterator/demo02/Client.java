package main.com.example.designpattern.Iterator.demo02;

import main.com.example.designpattern.Iterator.demo02.College.College;
import main.com.example.designpattern.Iterator.demo02.College.ComputerCollege;
import main.com.example.designpattern.Iterator.demo02.College.InfoCollege;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        // 创建学院
        List<College> colleges = new ArrayList<College>();
        ComputerCollege college = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();
        colleges.add(college);
        colleges.add(infoCollege);
        OutPutImpl outPutImpl = new OutPutImpl(colleges);
        outPutImpl.printCollege();
    }

}