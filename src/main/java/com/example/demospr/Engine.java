package com.example.demospr;

public class Engine {
    private String type;

    public Engine() {
        System.out.println("Engine bean is created");
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
