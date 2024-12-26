package FactoryPattern;

public class ComputerFactory{
    public static Computer getComputer(String type,String ram, String cpu,String gpu){
        if("PC".equalsIgnoreCase(type)) return new PC(ram,cpu,gpu);
        else if("Server".equalsIgnoreCase(type)) return new Server(ram,cpu,gpu);
        else return null;
    }
}
