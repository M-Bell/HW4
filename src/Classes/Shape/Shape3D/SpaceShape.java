package Classes.Shape.Shape3D;

import Classes.Shape.Shape;
import Classes.Vertex.Vertex3D;
import Interfaces.AreaMeasurable;
import Interfaces.VolumeMeasurable;

import java.util.ArrayList;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
    @Override
    public String toString() {
        return super.toString() +
                "\nArea: " + getArea() +
                "\nVolume: " + getVolume();
    }
}

