package FactoryPattern;

public class TestFactory {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc", "2GB", "500GB", "140Watt");
        Computer server = ComputerFactory.getComputer("server","16GB","2000GB","140Watt");

        System.out.println("Factory Pc config :: "+pc);
        System.out.println("Factory Server config :: "+server);

        PC patates = new PC("8GB","140Watt","512Gb");
        System.out.println(patates.getRAM());
    }
}
