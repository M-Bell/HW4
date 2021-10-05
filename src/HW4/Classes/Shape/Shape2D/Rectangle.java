package HW4.Classes.Shape.Shape2D;

import HW4.Classes.Vertex.Vertex2D;

public class Rectangle extends PlaneShape {
    private Vertex2D vertA;
    private double width;
    private double height;

    public Rectangle(Vertex2D vertA, double width, double height) {
        this.vertA = vertA;
        this.width = width;
        this.height = height;
        verticesList.add(vertA);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle\n" + super.toString();
    }
}
