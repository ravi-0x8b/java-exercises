package entities;

public class Rectangle {
    public double width;
    public double height;

    public double Area() {
        return width * height;
    }
    public double Perimeter() {
        return (width * 2) + (height * 2);
    }
    public double Diagonal() {
        double d = (Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2)));
        return d;
    }
}
