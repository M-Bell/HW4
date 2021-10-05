package HW4.Classes.Vertex;

public class Vertex2D extends Vertex {
    private final int x;
    private final int y;

    public Vertex2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "{" + x + ", " + y + "}";
    }
}
