package main.com.example.designpattern.Factory.demo03.AbstractFactory.Inteferce;

public class MiPC implements PC {
    public MiPC() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("make xiaomi PC!");
    }
}