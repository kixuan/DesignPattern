package main.com.example.designpattern.Factory.demo03.SimpleFactory.Inteferce;

public class MiPhone implements Phone {
    public MiPhone() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("make xiaomi phone!");
    }
}