package main.com.example.designpattern.Observer.demo01.abstract_;


import main.com.example.designpattern.Observer.demo01.Subject;

public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.add(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}