package main.com.example.designpattern.Factory.demo03.AbstractFactory.Inteferce;

import main.com.example.designpattern.Factory.demo03.SimpleFactory.Inteferce.IPhone;
import main.com.example.designpattern.Factory.demo03.SimpleFactory.Inteferce.Phone;

public class AppleFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new IPhone();
    }

    @Override
    public PC makePC() {
        return new MAC();
    }
}