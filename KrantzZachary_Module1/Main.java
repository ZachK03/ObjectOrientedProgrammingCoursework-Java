public class Main {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4,5);
        Rectangle rect2 = new Rectangle();
        rect2.setLength(5.7);
        rect2.setWidth(8.1);

        Circle circ1 = new Circle(4.2);
        Circle circ2 = new Circle();
        circ2.setRadius(3);

        System.out.println(rect1);
        System.out.println(rect2);
        System.out.println(circ1);
        System.out.println(circ2);
    }
}