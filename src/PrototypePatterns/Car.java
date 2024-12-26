package PrototypePatterns;

public class Car {
    private String model;
    private String color;
    private int year;

    // 1. Constructor: Tüm bilgileri alır
    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // 2. Constructor: Model ve renk bilgisi alır, yıl varsayılan olur
    public Car(String model, String color) {
        this(model, color, 2020); // Bir başka constructor'ı çağırır
    }

    // 3. Constructor: Sadece model bilgisi alır
    public Car(String model) {
        this(model, "Unknown", 2020); // Varsayılan renk ve yıl atanır
    }

    // 4. Varsayılan Constructor
    public Car() {
        this("Unknown", "Unknown", 2020); // Varsayılan değerlerle oluşturulur
    }

    @Override
    public String toString() {
        return "Car{model='" + model + "', color='" + color + "', year=" + year + '}';
    }
}
