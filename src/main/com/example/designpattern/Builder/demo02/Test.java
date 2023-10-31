package main.com.example.designpattern.Builder.demo02;

public class Test {

    public static void main(String[] args) {
        Builder Builder = new MacBookBuilder();
        Director pcDirector = new Director(Builder);
        pcDirector.construct("英特尔主板", "Retina显示器");

        Computer computer = Builder.build();
        System.out.println(computer.toString());
    }

}