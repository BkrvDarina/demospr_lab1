package com.example.demospr;

public class Car {
    private String brand;
    private String model;
    private Engine engine;

    public Car(){
        System.out.println("com.example.demospr.Car bean is created");
    }

    public Car(String brand, String model, Engine engine) {
        this.brand=brand;
        this.model=model;
        this.engine=engine;
    }

    public void start() {
        System.out.println("Starting the " + brand + " " + model + " with a " + engine.getType() + " engine.");
    }

    public String getBrand() {
        return brand;
    }
     public void setBrand(String brand){
        this.brand=brand;
     }

     public String getModel(){
        return model;
     }

     public void setModel(String model){
        this.model=model;
     }

     public Engine getEngine(){
        return engine;
     }

     public void setEngine(Engine engine){
         System.out.println("Car: setEngine");
        this.engine=engine;
     }
}