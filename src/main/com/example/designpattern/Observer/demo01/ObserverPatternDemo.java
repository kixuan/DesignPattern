package main.com.example.designpattern.Observer.demo01;

import main.com.example.designpattern.Observer.demo01.abstract_.BinaryObserver;
import main.com.example.designpattern.Observer.demo01.abstract_.HexaObserver;
import main.com.example.designpattern.Observer.demo01.abstract_.OctalObserver;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}