package main.com.example.designpattern.Factory.demo03.SimpleFactory;

import main.com.example.designpattern.Factory.demo03.SimpleFactory.Inteferce.IPhone;
import main.com.example.designpattern.Factory.demo03.SimpleFactory.Inteferce.MiPhone;
import main.com.example.designpattern.Factory.demo03.SimpleFactory.Inteferce.Phone;

public class PhoneFactory {
    public Phone makePhone(String phoneType) {
        if (phoneType.equalsIgnoreCase("MiPhone")) {
            return new MiPhone();
        } else if (phoneType.equalsIgnoreCase("iPhone")) {
            return new IPhone();
        }
        return null;
    }
}