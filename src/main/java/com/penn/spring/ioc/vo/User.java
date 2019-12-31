package com.penn.spring.ioc.vo;

/**
 * @author penn
 * @since 2019/12/12
 */
public class User {

    public User(Order order){
        this.order = order;
    }
    private Order order;

    public String sayHello(String userName){
        return "user " + userName;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
