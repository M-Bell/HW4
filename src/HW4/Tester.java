package HW4;

import HW4.Classes.Shape.Shape;
import HW4.Classes.Shape.Shape2D.Circle;
import HW4.Classes.Shape.Shape2D.Rectangle;
import HW4.Classes.Shape.Shape2D.Triangle;
import HW4.Classes.Shape.Shape3D.Cuboid;
import HW4.Classes.Shape.Shape3D.Sphere;
import HW4.Classes.Shape.Shape3D.SquarePyramid;
import HW4.Classes.Vertex.Vertex2D;
import HW4.Classes.Vertex.Vertex3D;

public class Tester {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];
        Triangle triangle = new Triangle(new Vertex2D(0, 0), new Vertex2D(3, 0), new Vertex2D(0, 4));
        Circle circle = new Circle(new Vertex2D(0, 0), 5);
        Rectangle rectangle = new Rectangle(new Vertex2D(3, 2), 10, 2);
        Sphere sphere = new Sphere(new Vertex3D(0, 0, 0), 5);
        Cuboid cuboid = new Cuboid(new Vertex3D(0, 0, 0), 5, 5, 5);
        SquarePyramid squarePyramid = new SquarePyramid(new Vertex3D(0, 0, 0), 5, 10);
        shapes[0] = triangle;
        shapes[1] = circle;
        shapes[2] = rectangle;
        shapes[3] = sphere;
        shapes[4] = cuboid;
        shapes[5] = squarePyramid;
        for (Shape a : shapes) {
            System.out.println(a + "\n");
        }
    }
}
