public class Rectangle {
    double length;
    double breadth;

    void calculateArea() {
        double area = length * breadth;
        System.out.println("Rectangle Details");
        System.out.println("Length : " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area   : " + area);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();

        r.length = 10;
        r.breadth = 5;

        r.calculateArea();
    }
}