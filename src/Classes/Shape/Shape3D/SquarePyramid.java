package Classes.Shape.Shape3D;

import Classes.Vertex.Vertex3D;

public class SquarePyramid extends SpaceShape {
    private final Vertex3D baseCenter;
    private final double baseWidth;
    private final double pyramidHeight;

    public SquarePyramid(Vertex3D baseCenter, double baseWidth, double pyramidHeight) {
        this.baseCenter = baseCenter;
        this.baseWidth = baseWidth;
        this.pyramidHeight = pyramidHeight;
        verticesList.add(baseCenter);
    }

    private double getBaseArea() {
        return baseWidth * baseWidth;
    }

    private double getSideArea() {
        double sideLen = Math.sqrt(pyramidHeight * pyramidHeight + baseWidth * baseWidth / 2);
        double sideHeight = Math.sqrt(sideLen * sideLen - baseWidth * baseWidth / 4);
        return sideHeight * baseWidth * 2;
    }

    @Override
    public double getArea() {
        return getBaseArea() + getSideArea();
    }

    @Override
    public double getVolume() {
        return pyramidHeight * getBaseArea() / 3;
    }

    @Override
    public String toString() {
        return "Square Pyramid\n" + super.toString();
    }
}
