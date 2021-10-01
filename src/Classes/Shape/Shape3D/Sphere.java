package Classes.Shape.Shape3D;

import Classes.Vertex.Vertex2D;
import Classes.Vertex.Vertex3D;

public class Sphere extends SpaceShape{
    private Vertex3D center;
    private final double radius;

    public Sphere(Vertex3D center, double radius) {
        this.center = center;
        this.radius = radius;
        verticesList.add(center);
    }

    @Override
    public double getArea() {
        return 4*Math.PI*radius*radius;
    }

    @Override
    public double getVolume() {
        return 4*Math.PI*radius*radius*radius/3;
    }

    @Override
    public String toString() {
        return "Sphere\n" + super.toString();
    }
}
