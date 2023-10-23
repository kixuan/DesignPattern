package main.com.example.designpattern.Strategy.demo01;

import main.com.example.designpattern.Strategy.demo01.Interferce.AlipayPaymentStrategy;
import main.com.example.designpattern.Strategy.demo01.Interferce.WechatPaymentStrategy;

import java.math.BigDecimal;

public class StrategyTest {

    public static void main(String[] args) {

        PaymentService paymentService = new PaymentService();

        // 使用银行卡支付
        paymentService.payment(new AlipayPaymentStrategy(), new BigDecimal("100"));

        // 使用微信支付
        paymentService.payment(new WechatPaymentStrategy(), new BigDecimal("100"));

        //使用支付宝支付
        paymentService.payment(new AlipayPaymentStrategy(), new BigDecimal("100"));

    }
}
