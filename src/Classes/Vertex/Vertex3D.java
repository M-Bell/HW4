package Classes.Vertex;

public class Vertex3D extends Vertex2D{

    private final int z;

    public Vertex3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }
}
