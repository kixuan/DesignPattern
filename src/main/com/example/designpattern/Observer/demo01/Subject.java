package main.com.example.designpattern.Observer.demo01;

import lombok.Getter;
import main.com.example.designpattern.Observer.demo01.abstract_.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private final List<Observer> observers = new ArrayList<Observer>();
    @Getter
    private int state;

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}