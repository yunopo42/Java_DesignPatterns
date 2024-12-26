package DecoratorPattern;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble(); // Çıktı: Basic Car. Adding features of Sports Car.
        System.out.println("\n************");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble(); // Çıktı: Basic Car. Adding features of Luxury Car. Adding features of Sports Car.
    }
}