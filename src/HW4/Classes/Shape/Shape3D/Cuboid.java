package HW4.Classes.Shape.Shape3D;

import HW4.Classes.Vertex.Vertex2D;

public class Cuboid extends SpaceShape {
    private final Vertex2D vertA;
    private final double width;
    private final double height;
    private final double depth;

    public Cuboid(Vertex2D vertA, double width, double height, double depth) {
        this.vertA = vertA;
        this.width = width;
        this.height = height;
        this.depth = depth;
        verticesList.add(vertA);
    }

    @Override
    public double getArea() {
        return width * height * 4 + width * depth * 2;
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return "Cuboid\n" + super.toString();
    }
}
