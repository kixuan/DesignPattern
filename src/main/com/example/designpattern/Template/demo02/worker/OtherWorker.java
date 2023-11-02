package main.com.example.designpattern.Template.demo02.worker;

import main.com.example.designpattern.Template.demo02.Worker;

/**
 * Created by jingbin on 2016/11/2.
 * 一些自由人员
 */

public class OtherWorker extends Worker {

    public OtherWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name + ",打LOL...");
    }
}
