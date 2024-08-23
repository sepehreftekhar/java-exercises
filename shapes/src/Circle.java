public class Circle extends shape{
    private double radius;

    /*public Circle(double radius){
        this.radius = radius;
    }*/

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius must be positive.");
        }
    }

    public double calculateArea(){
        return Math.PI * radius * radius;
    }
}
