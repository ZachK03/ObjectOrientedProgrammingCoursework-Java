public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double l, double w) {
        setLength(l);
        setWidth(w);
    }

    public Rectangle() {
        length = 0;
        width = 0;
    }

    public void setLength(double l) {
        length = l;
    }
    public void setLength(int l) {
        length = l;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double w) {
        width = w;
    }
    public void setWidth(int w) {
        width = w;
    }

    public double getWidth() {
        return width;
    }

    public double computeArea() {
        return width * length;
    }

    public String toString() {
        String output;
        output = "Rectangle with sides " + length + " and " + width + " has area of " + computeArea();
        return output;
    }
}
