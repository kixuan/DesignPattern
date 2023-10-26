package main.com.example.designpattern.Factory.demo03.AbstractFactory.Inteferce;

public class MAC implements PC {
    public MAC() {
        this.make();
    }

    @Override
    public void make() {
        System.out.println("make MAC!");
    }
}