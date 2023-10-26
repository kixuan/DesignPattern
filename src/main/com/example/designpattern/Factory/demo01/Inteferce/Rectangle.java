package main.com.example.designpattern.Factory.demo01.Inteferce;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}