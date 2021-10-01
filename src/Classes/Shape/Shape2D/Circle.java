package Classes.Shape.Shape2D;

import Classes.Vertex.Vertex2D;

public class Circle extends PlaneShape{
    private Vertex2D center;
    private final double radius;

    public Circle(Vertex2D center, double radius) {
        this.center = center;
        this.radius = radius;
        verticesList.add(center);
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle\n" + super.toString();
    }
}
