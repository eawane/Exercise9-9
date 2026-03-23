public class Circle {

    // Private data fields
    private double radius;
    private static int numberOfObjects = 0;

    // Default constructor
    public Circle() {
        radius = 1;
        numberOfObjects++;
    }

    // Constructor with radius
    public Circle(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double newRadius) {
        if (newRadius >= 0) {
            radius = newRadius;
        }
    }

    // Getter for numberOfObjects
    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    // Method to calculate area
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }
}
