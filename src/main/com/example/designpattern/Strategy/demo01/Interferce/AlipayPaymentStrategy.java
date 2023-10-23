package main.com.example.designpattern.Strategy.demo01.Interferce;


import java.math.BigDecimal;

public class AlipayPaymentStrategy implements PaymentStrategy {
    @Override
    public void payment(BigDecimal amount) {
        System.out.println("使用支付宝支付" + amount);
        // 调用支付宝支付API
    }
}
