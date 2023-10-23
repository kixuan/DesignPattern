package main.com.example.designpattern.Observer.demo01.abstract_;

import main.com.example.designpattern.Observer.demo01.Subject;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}