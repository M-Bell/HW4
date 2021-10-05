package HW4.Classes.Shape.Shape3D;

import HW4.Classes.Shape.Shape;
import HW4.Interfaces.AreaMeasurable;
import HW4.Interfaces.VolumeMeasurable;

public abstract class SpaceShape extends Shape implements AreaMeasurable, VolumeMeasurable {
    @Override
    public String toString() {
        return super.toString() +
                "\nArea: " + getArea() +
                "\nVolume: " + getVolume();
    }
}

