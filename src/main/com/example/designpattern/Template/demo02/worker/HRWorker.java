package main.com.example.designpattern.Template.demo02.worker;

import main.com.example.designpattern.Template.demo02.Worker;


/**
 * Created by jingbin on 2016/11/2.
 * HR
 */

public class HRWorker extends Worker {

    public HRWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name + ", 看简历 - 打电话 - 接电话");
    }
}
