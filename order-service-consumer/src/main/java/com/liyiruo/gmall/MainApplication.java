package com.liyiruo.gmall;

import com.liyiruo.gmall.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author liyiruo
 * @Description
 * @Date 2021/2/14 上午12:12
 */
public class MainApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService orderService = applicationContext.getBean(OrderService.class);

        orderService.initOrder("1");
        System.in.read();
    }
}
