package main.com.example.designpattern.Factory.demo03.AbstractFactory.Inteferce;

import main.com.example.designpattern.Factory.demo03.SimpleFactory.Inteferce.Phone;

public interface AbstractFactory {
    Phone makePhone();

    PC makePC();
}