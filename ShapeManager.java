import java.util.ArrayList;

public class ShapeManager {
    private ArrayList<shape> shapes = new ArrayList<>();

    public void addShape(shape shape) {
        if (shape != null) {
            shapes.add(shape);
        }
    }

    public double calculateTotalArea() {
        double totalArea = 0.0;
        for (shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}
