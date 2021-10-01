package Classes.Shape.Shape2D;

import Classes.Vertex.Vertex2D;

public class Triangle extends PlaneShape {
    private final Vertex2D vertA;
    private final Vertex2D vertB;
    private final Vertex2D vertC;
    private final double sideAB;
    private final double sideAC;
    private final double sideBC;


    public Triangle(Vertex2D vertA, Vertex2D vertB, Vertex2D vertC) {
        this.vertA = vertA;
        this.vertB = vertB;
        this.vertC = vertC;
        verticesList.add(vertA);
        verticesList.add(vertB);
        verticesList.add(vertC);
        sideAB = countVertDistance(vertA, vertB);
        sideAC = countVertDistance(vertA, vertC);
        sideBC = countVertDistance(vertB, vertC);
    }


    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - sideAC) * (p - sideAB) * (p - sideBC));
    }

    @Override
    public double getPerimeter() {
        return sideAB + sideAC + sideBC;
    }

    @Override
    public String toString() {
        return "Triangle\n" +
                super.toString();
    }
}
