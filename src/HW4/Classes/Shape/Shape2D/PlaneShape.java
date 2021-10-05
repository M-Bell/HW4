package HW4.Classes.Shape.Shape2D;

import HW4.Classes.Shape.Shape;
import HW4.Classes.Vertex.Vertex2D;
import HW4.Interfaces.AreaMeasurable;
import HW4.Interfaces.PerimeterMeasurable;

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
