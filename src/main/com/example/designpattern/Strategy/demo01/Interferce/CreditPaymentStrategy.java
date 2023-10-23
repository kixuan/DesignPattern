package main.com.example.designpattern.Strategy.demo01.Interferce;


import java.math.BigDecimal;

public class CreditPaymentStrategy implements PaymentStrategy {
    @Override
    public void payment(BigDecimal amount) {
        System.out.println("使用银行卡支付" + amount);
        // 去调用网联接口
    }
}
