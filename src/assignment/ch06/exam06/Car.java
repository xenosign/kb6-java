package assignment.ch06.exam06;

public class Car {
    //필드선언
    String company = "현대자동차";  // null
    String model;
    String color;
    int maxSpeed;

    public Car() {}

    public Car(String model) {
        this(model, "오렌지", 999999999);
    }

    public Car(String model, String color) {
        this(model, color, 999999999);
    }

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
