package task10OOPS;
public class Circle {
    private double radius;

    // No-argument constructor
    public Circle() {
        this.radius = 0.0;
    }

    // Constructor with two arguments
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Getter and setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        // Create circle objects and test the functionality
        Circle circle1 = new Circle(); // No argument constructor
        circle1.setRadius(5.0); // Set radius using setter
        System.out.println("Circumference of circle1: " + circle1.calculateCircumference());

        Circle circle2 = new Circle(3.0); // Constructor with argument
        System.out.println("Circumference of circle2: " + circle2.calculateCircumference());
    }
}