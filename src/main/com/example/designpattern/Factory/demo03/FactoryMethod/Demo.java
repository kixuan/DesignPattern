package main.com.example.designpattern.Factory.demo03.FactoryMethod;

import main.com.example.designpattern.Factory.demo03.FactoryMethod.Inteferce.AbstractFactory;
import main.com.example.designpattern.Factory.demo03.FactoryMethod.Inteferce.AppleFactory;
import main.com.example.designpattern.Factory.demo03.FactoryMethod.Inteferce.XiaoMiFactory;

public class Demo {
    public static void main(String[] arg) {
        AbstractFactory miFactory = new XiaoMiFactory();
        AbstractFactory appleFactory = new AppleFactory();
        miFactory.makePhone();            // make xiaomi phone!
        appleFactory.makePhone();        // make iphone!
    }
}