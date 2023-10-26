package main.com.example.designpattern.Factory.demo01;

import main.com.example.designpattern.Factory.demo01.Inteferce.Shape;
import org.junit.Test;

public class factoryPatternDemo {

    @Test
    public void test() {
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取 Circle 的对象，并调用它的 draw 方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        //获取 Rectangle 的对象，并调用它的 draw 方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        //获取 Square 的对象，并调用它的 draw 方法
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}