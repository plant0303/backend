package a1122;

public class CarEx {
    public static void main(String[] args) {
        Car car1 = new Car("HYUNDAI", "SONATA");
        Car car2 = new Car("TOYOTA");
        Car car3 = new Car("Honda", "Civic");

        car1.display();
        car2.display();
        car3.display();
    }
}

class Car {
    String brand;
    String model;

    public Car(){
        // 현재 클래스의 다른 생성자 호출
        this("Unknown", "Unknown");
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void display(){
        System.out.println("Brand: " + brand + ", model: " + model);
    }


}
