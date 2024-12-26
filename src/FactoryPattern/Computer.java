package FactoryPattern;

public abstract class Computer {
    public abstract String getRAM();
    public abstract String getCPU();
    public abstract String getGPU();

    @Override
    public String toString() {
        return "RAM = "+this.getRAM() + ", CPU = "+this.getCPU() + ", GPU = "+this.getGPU();
    }
}
