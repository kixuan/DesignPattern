package main.com.example.designpattern.Factory.demo03.SimpleFactory.Inteferce;

public class IPhone implements Phone {
    public IPhone() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("make iphone!");
    }
}