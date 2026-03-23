public class TestCircle {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        Circle c2 = new Circle(5);

        System.out.println("Radius c1: " + c1.getRadius());
        System.out.println("Area c2: " + c2.getArea());

        c1.setRadius(10);
        System.out.println("New radius c1: " + c1.getRadius());

        System.out.println("Number of objects: " + Circle.getNumberOfObjects());
    }
}
