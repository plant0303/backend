package a1120.class1;

public class Car {
    public String company;
    public String model;
    public String color;
    public int maxSpeed;
    public int speed;
    
    public Car(){};
    public Car(String company, String model, String color, int maxSpeed, int speed ){
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.speed = speed;
    }
}