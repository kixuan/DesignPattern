package main.com.example.designpattern.Factory.demo01;

import main.com.example.designpattern.Factory.demo01.Inteferce.Circle;
import main.com.example.designpattern.Factory.demo01.Inteferce.Rectangle;
import main.com.example.designpattern.Factory.demo01.Inteferce.Shape;
import main.com.example.designpattern.Factory.demo01.Inteferce.Square;

public class ShapeFactory {

    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}