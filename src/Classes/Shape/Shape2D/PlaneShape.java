package Classes.Shape.Shape2D;

import Classes.Shape.Shape;
import Classes.Vertex.Vertex2D;
import Interfaces.AreaMeasurable;
import Interfaces.PerimeterMeasurable;

public abstract class PlaneShape extends Shape implements AreaMeasurable, PerimeterMeasurable {
    protected double countVertDistance(Vertex2D X, Vertex2D Y) {
        return Math.sqrt(Math.pow(X.getX() - Y.getX(), 2) + Math.pow(X.getY() - Y.getY(), 2));
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPerimeter: " + getPerimeter() +
                "\nArea: " + getArea();
    }
}
