package session_14_polymorphism.practice.compiletime_polymoprhism;

public class Geometry {
    // area of a circle
    public double area(double radius) {
        return 3.14 * radius * radius;
    }
    //calculate area of a triangle

    public double area(double base, double height) {
        return 0.5 * base * height;

    }
}
