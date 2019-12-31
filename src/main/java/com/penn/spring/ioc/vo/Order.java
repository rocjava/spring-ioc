package com.penn.spring.ioc.vo;

/**
 * @author penn
 * @since 2019/12/12
 */
public class Order {

    public Order(User user){
        this.user = user;
    }
    private User user;

    public String create(String goodsName){
        return  user.sayHello("penn.zhang") + " buy a " + goodsName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
