package PrototypePatterns;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla Model S", "Red", 2023); // Tüm bilgileri ver
        Car car2 = new Car("Tesla Model 3", "Blue"); // Varsayılan yıl
        Car car3 = new Car("Tesla Model X"); // Varsayılan renk ve yıl
        Car car4 = new Car(); // Tamamen varsayılan

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
    }
}
