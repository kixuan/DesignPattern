package main.com.example.designpattern.Builder.demo02;

/**
 * 抽象建造者
 */
public abstract class Builder {

    abstract void buildBoard(String board);

    abstract void buildDisplay(String display);

    abstract void buildOs();

    abstract Computer build();

}