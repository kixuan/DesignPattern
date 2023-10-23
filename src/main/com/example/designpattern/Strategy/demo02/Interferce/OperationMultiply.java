package main.com.example.designpattern.Strategy.demo02.Interferce;

public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}