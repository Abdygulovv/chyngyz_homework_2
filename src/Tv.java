import java.util.Arrays;

public class Tv extends Technique {
    private int diagonal;
    private int[] resolution;

    public Tv(String name, int  diagonal, int[] resolution) {
        super(name);
        this. diagonal = diagonal;
        this.resolution = resolution;
    }


    @Override
    public void print() {
        System.out.println("Tv: " + " diagonal: " + diagonal + " resolution: " + Arrays.toString(resolution));

    }
}