class Geometry {

    // Area of square
    double area(double side) {
        return side * side;
    }

    // Area of rectangle
    double area(double length, double width) {
        return length * width;
    }

    // Area of circle
    double area(int radius) {
        return 3.14 * radius * radius;
    }
}

public class GeometryArea {
    public static void main(String[] args) {

        Geometry g = new Geometry();

        System.out.println("Area of Square : " + g.area(5.0));
        System.out.println("Area of Rectangle : " + g.area(10.0, 5.0));
        System.out.println("Area of Circle : " + g.area(7));
    }
}

