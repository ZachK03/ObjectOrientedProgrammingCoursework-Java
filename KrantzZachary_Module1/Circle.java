public class Circle {
    private double radius;

    public Circle(double r) {
        radius = r;
    }
    public Circle() {
        radius = 0;
    }

    public void setRadius(double r) {
        radius = r;
    }
    public void setRadius(int r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double computeArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        String output;
        output = "Circle with radius " + radius + " has area of " + computeArea();
        return output;
    }
}
