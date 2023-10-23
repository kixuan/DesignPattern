package main.com.example.designpattern.Strategy.demo02;

import main.com.example.designpattern.Strategy.demo02.Interferce.OperationAdd;
import main.com.example.designpattern.Strategy.demo02.Interferce.OperationMultiply;
import main.com.example.designpattern.Strategy.demo02.Interferce.OperationSubtract;

public class StrategyTest {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}