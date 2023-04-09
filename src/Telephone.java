public class Telephone extends Technique {
    private int camera;

    public Telephone(String name, int camera) {
        super(name);
        this.camera = camera;
    }

    @Override
    public void print() {
        System.out.println("Telephone: " + " camera: " + camera + "Mpx");

    }
}
