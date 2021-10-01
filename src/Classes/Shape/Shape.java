package Classes.Shape;

import Classes.Vertex.Vertex;

import java.util.ArrayList;

public abstract class Shape {
    protected ArrayList<Vertex> verticesList = new ArrayList<>();

    @Override
    public String toString() {
        return "Vertices: " + verticesList;
    }
}
