public class Triangle extends shape{
    private double height;
    private double baseLength;

    public Triangle(double height, double baseLenght){
        this.height = height;
        this.baseLength = baseLenght;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("heigth of triangle must be positive.");
        }
    }

    public double getBaseLength() {
        return baseLength;
    }

    public void setBaseLength(double baseLength) {
        if (baseLength > 0) {
            this.baseLength = baseLength;
        } else {
            System.out.println("Base length must be positive.");
        }
    }

    public double calculateArea() {
        return (baseLength * height) / 2;
    }
}
