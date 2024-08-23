public class Main {
    public static void main(String[] args) {
        ShapeManager manager = new ShapeManager();

        //manager.addShape(new Circle(5.0));
        manager.addShape(new Square(10.0));
        manager.addShape(new Triangle(4.0,5.1));

        System.out.println("Total area of all shapes: " + manager.calculateTotalArea());

        Circle circle = new Circle();
        circle.setRadius(3);
        System.out.print(circle.calculateArea());

    }
}