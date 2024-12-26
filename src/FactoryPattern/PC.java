package FactoryPattern;

public class PC extends Computer {
    private String ram;
    private String gpu;
    private String cpu;

    public PC(String ram, String gpu, String cpu) {
        this.ram = ram;
        this.gpu = gpu;
        this.cpu = cpu;
    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }

    @Override
    public String getGPU() {
        return this.gpu;
    }
}
