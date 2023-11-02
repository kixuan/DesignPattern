package main.com.example.designpattern.Template.demo02;

import main.com.example.designpattern.Template.demo02.worker.HRWorker;
import main.com.example.designpattern.Template.demo02.worker.ITWorker;
import main.com.example.designpattern.Template.demo02.worker.OtherWorker;
import main.com.example.designpattern.Template.demo02.worker.QAWorker;

/**
 * @author kixuan
 * @version 1.0
 */
public class TemplateMethodActivity {
    public static void main(String[] args) {
        Worker worker = new HRWorker("鸿洋");
        worker.workOneDay();

        Worker worker1 = new ITWorker("老张");
        worker1.workOneDay();

        Worker worker2 = new QAWorker("老李");
        worker2.workOneDay();

        Worker worker3 = new OtherWorker("老赵");
        worker3.workOneDay();
    }
}
