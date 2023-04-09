public class Computer extends Technique{
    private String cpu;
    private int numberOfKeyboards;
    private int ram;

    public Computer(String name, String cpu, int numberOfKeyboards, int ram) {
        super(name);
        this.cpu = cpu;
        this.numberOfKeyboards = numberOfKeyboards;
        this.ram = ram;
    }

    @Override
    public void print() {
        System.out.println("Computer: " + " Cpu: " + cpu + " NumberOfKeyboards: " + numberOfKeyboards + " Ram: "
        + ram);
    }
}
