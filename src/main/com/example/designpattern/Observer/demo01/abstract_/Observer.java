package main.com.example.designpattern.Observer.demo01.abstract_;

import main.com.example.designpattern.Observer.demo01.Subject;

public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}