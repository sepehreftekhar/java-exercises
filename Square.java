public class Square extends shape{
    private double lengthSide;

    public Square(double lengthSide){
        this.lengthSide = lengthSide;
    }

    public double getLengthSide() {
        return lengthSide;
    }

    public void setLengthSide(double lengthSide) {
        if (lengthSide > 0) {
            this.lengthSide = lengthSide;
        } else {
            System.out.println("Side length must be positive.");
        }
    }

    public double calculateArea() {
        return lengthSide * 4;
    }
}
