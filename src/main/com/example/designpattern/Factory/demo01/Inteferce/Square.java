package main.com.example.designpattern.Factory.demo01.Inteferce;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}