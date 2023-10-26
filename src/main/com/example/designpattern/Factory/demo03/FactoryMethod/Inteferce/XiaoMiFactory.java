package main.com.example.designpattern.Factory.demo03.FactoryMethod.Inteferce;

import main.com.example.designpattern.Factory.demo03.SimpleFactory.Inteferce.MiPhone;
import main.com.example.designpattern.Factory.demo03.SimpleFactory.Inteferce.Phone;

public class XiaoMiFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new MiPhone();
    }
}