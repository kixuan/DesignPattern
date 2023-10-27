package main.com.example.designpattern.Iterator.demo02;

import lombok.Getter;
import lombok.Setter;

/**
 * 系
 */
@Getter
@Setter
public class Department {

    private String name;
    private String desc;

    public Department(String name, String desc) {

        // 1. 这个类没有显式继承其他类，所以默认继承object
        // 2. super()调用父类的构造器，这里调用的是object的构造器
        // 3. 一般可以省略，这里是加强代码可读性
        super();
        this.name = name;
        this.desc = desc;
    }
}