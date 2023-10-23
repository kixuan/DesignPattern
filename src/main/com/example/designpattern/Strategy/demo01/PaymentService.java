package main.com.example.designpattern.Strategy.demo01;

import main.com.example.designpattern.Strategy.demo01.Interferce.PaymentStrategy;

import java.math.BigDecimal;

public class PaymentService {

    /**
     * 将strategy作为参数传递给支付服务
     */
    public void payment(PaymentStrategy strategy, BigDecimal amount) {
        strategy.payment(amount);
    }
}
