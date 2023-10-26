package main.com.example.designpattern.Factory.demo03.SimpleFactory;

import main.com.example.designpattern.Factory.demo03.SimpleFactory.Inteferce.IPhone;
import main.com.example.designpattern.Factory.demo03.SimpleFactory.Inteferce.Phone;

public class Demo {
    public static void main(String[] arg) {
        PhoneFactory factory = new PhoneFactory();
        Phone miPhone = factory.makePhone("MiPhone");            // make xiaomi phone!
        IPhone iPhone = (IPhone) factory.makePhone("iPhone");    // make iphone!
    }
}