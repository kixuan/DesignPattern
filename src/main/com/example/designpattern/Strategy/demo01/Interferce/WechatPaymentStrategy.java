package main.com.example.designpattern.Strategy.demo01.Interferce;

import java.math.BigDecimal;

public class WechatPaymentStrategy implements main.com.example.designpattern.Strategy.demo01.Interferce.PaymentStrategy {
    @Override
    public void payment(BigDecimal amount) {
        System.out.println("使用微信支付" + amount);
        // 调用微信支付API
    }
}
