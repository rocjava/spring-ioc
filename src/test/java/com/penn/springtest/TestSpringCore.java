package com.penn.springtest;

import com.penn.spring.ioc.vo.Order;
import com.penn.spring.ioc.vo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author penn
 * @since 2019/12/12
 */
public class TestSpringCore {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) applicationContext.getBean("user001");
        user.sayHello("penn.zhang");

        Order order = (Order) applicationContext.getBean("order001");
        order.create("橘子");
    }
}
