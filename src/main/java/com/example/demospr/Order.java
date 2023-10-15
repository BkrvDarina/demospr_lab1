package com.example.demospr;

public class Order {
    private int orderId;
    private String orderDate;
    private Car car;

    public Order(int orderId, String orderDate, Car car){
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.car = car;
    }
}
