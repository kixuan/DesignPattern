package main.com.example.designpattern.Factory.demo03.AbstractFactory;

import main.com.example.designpattern.Factory.demo03.AbstractFactory.Inteferce.AbstractFactory;
import main.com.example.designpattern.Factory.demo03.AbstractFactory.Inteferce.AppleFactory;
import main.com.example.designpattern.Factory.demo03.AbstractFactory.Inteferce.XiaoMiFactory;

public class Demo {
    public static void main(String[] arg) {
        AbstractFactory miFactory = new XiaoMiFactory();
        AbstractFactory appleFactory = new AppleFactory();
        miFactory.makePhone();            // make xiaomi phone!
        miFactory.makePC();                // make xiaomi PC!
        appleFactory.makePhone();        // make iphone!
        appleFactory.makePC();            // make MAC!
    }
}